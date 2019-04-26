package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Modelo.CrearArchivoIni;
import Modelo.LeerIni;
import java.sql.Connection;
import java.sql.Date;
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
    private String Ruta;

    public BaseDatos(String ip, String contra, String usuario, String baseD) {
        this.ip = ip;
        this.contra = contra;
        this.usuario = usuario;
        this.baseD = baseD;
        this.conectar();
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }
    
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
    
    

     private boolean conectar(){
    
            if (this.conexion==null) {
                    try {
                 ArhIni= new LeerIni();
            ArhIni.LeerArIni(Ruta+"\\conexion.ini");
            Class.forName("com.mysql.jdbc.Driver");
            this.conexion= DriverManager.getConnection("jdbc:mysql://"+ArhIni.getParametro().getProperty("ip","default value")+"/"+ArhIni.getParametro().getProperty("bd","default value")+"?useServerPrepStmts=true",ArhIni.getParametro().getProperty("usuario","default value"),ArhIni.getParametro().getProperty("contra","default value"));
            return true;
        } catch (ClassNotFoundException ex) {
           System.out.println("Driver no cargado");
           return false;
        } catch (SQLException ex) {
             System.out.println("Error al conectar");
             return false;
        }
            }
         
        return true;
    }
    
    public boolean comprobarConexion(){
        return this.conectar()==true;
    }
    public boolean levantarServidor(){
        this.ArchIniCrear= new CrearArchivoIni(this.Ruta);
        System.out.println(Ruta);
        System.out.println(ip+baseD+usuario+Ruta+contra);
            this.ArchIniCrear.Limpiar();
              this.ArchIniCrear.Escribir("[Caracteristicas]");
                this.ArchIniCrear.Escribir("ip="+this.ip);
                this.ArchIniCrear.Escribir("bd="+this.baseD);
                this.ArchIniCrear.Escribir("contra="+this.contra);
                this.ArchIniCrear.Escribir("usuario="+this.usuario);
                this.ArchIniCrear.Escribir("Ruta="+this.Ruta);
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
            if (parm[i] instanceof java.lang.String) {
                try {

                    this.sentencia.setString(i + 1, parm[i].toString());
                } catch (SQLException ex) {
                    Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }
            }

            if (parm[i] instanceof java.lang.Integer) {
                try {

                    this.sentencia.setInt(i + 1, Integer.parseInt(parm[i].toString()));
                } catch (SQLException ex) {
                    Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                    return false;

                }
            }
            if (parm[i] instanceof java.lang.Double) {
                try {

                    this.sentencia.setDouble(i + 1, Double.parseDouble(parm[i].toString()));
                } catch (SQLException ex) {
                    Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                    return false;

                }
            }
            if (parm[i] instanceof java.util.Date) {
                try {

                    this.sentencia.setDate(i + 1, (Date) parm[i]);
                } catch (SQLException ex) {
                    Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
                    return false;

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
        this.Ruta="C:\\Users\\Cristian Lopez\\Documents\\java progra2 2019\\laboratoriop2\\RiteveBDyArchSegundProyect";
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
