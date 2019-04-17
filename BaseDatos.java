/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juan_
 */
public class BaseDatos {

    private static Connection conexion;
    private PreparedStatement sentencia;
    private ResultSet datos;
    private LeerIni ArhIni;
    private CrearArchivoIni ArchIniCrear;
    private String ip,contra,usuario,baseD;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getBaseD() {
        return baseD;
    }

    public void setBaseD(String baseD) {
        this.baseD = baseD;
    }
    
    

    public boolean conectar() {
        if (this.conexion == null) {
            try {
                ArhIni= new LeerIni("C:\\Users\\juan_\\Desktop\\I cuatri 2019\\proyecto2\\Proyecto2.0\\conexion.ini");
                Class.forName("com.mysql.jdbc.Driver");//cargamos el driver
                this.conexion = DriverManager.getConnection("jdbc:mysql://"+ArhIni.getParametro().getProperty("ip","default value")+
                "/"+ArhIni.getParametro().getProperty("bd","default value")+"?useServerPrepStmts=true", 
                  ArhIni.getParametro().getProperty("usuario","default value"),
                  ArhIni.getParametro().getProperty("contra","default value"));
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        return false;
    }
    public boolean levantarServidor(){
        this.ArchIniCrear= new CrearArchivoIni();
              this.ArchIniCrear.Escribir("[Caracteristicas]");
                this.ArchIniCrear.Escribir("ip="+this.ip);
                this.ArchIniCrear.Escribir("bd="+this.baseD);
                this.ArchIniCrear.Escribir("contra="+this.contra);
                this.ArchIniCrear.Escribir("usuario="+this.usuario);
                this.ArchIniCrear.Guardar();
                this.conexion=null;
                if (this.conectar()) {
            return true;
        }
                return false;
    }
    public boolean setSentencia(String sql) {
        try {
            this.sentencia = this.conexion.prepareStatement(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean setParametros(Object[] parm) {
        for (int i = 0; i < parm.length; i++) {
            if (parm[i] instanceof String) {
                try {

                    this.sentencia.setString(i + 1, parm[i].toString());
                } catch (SQLException ex) {
                    Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }
            } else {
                if (parm[i] instanceof Integer) {
                    try {

                        this.sentencia.setInt(i + 1, Integer.parseInt(parm[i].toString()));
                    } catch (SQLException ex) {
                        Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                        return false;

                    }
                }
            }
        }
        return true;
    }

    public boolean Ejecutar() {
        try {
            if (this.sentencia.execute()) {
                this.datos = this.sentencia.getResultSet();
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean ejecutar(Object[] parm) {
        this.setParametros(parm);
        return Ejecutar();
    }

    public BaseDatos() {

        this.conectar();
    }

    public BaseDatos(String sql) {
        this.conectar();
        this.setSentencia(sql);
    }

    public Object[] getOject() {
        try {
            if (this.datos.next()) {
                ArrayList<Object> obj = new ArrayList();
                for (int i = 1; i <= this.datos.getMetaData().getColumnCount(); i++) {

                    obj.add(this.datos.getObject(i));

                }
                return obj.toArray();
            }
        } catch (SQLException ex) {
        }
        return null;
    }
}
