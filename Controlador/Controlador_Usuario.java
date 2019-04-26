/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.BaseDatos;
import Modelo.Cliente;
import Modelo.Persona;
import Modelo.Secretaria;
import Modelo.tecnico;
import Vista.FrmConexion;
import Vista.IFAcutalizarUsuario;
import Vista.IFAgregarUsuario;
import Vista.IFBuscarUsuario;
import Vista.IFEliminarUsuario;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juan_
 */
public class Controlador_Usuario {
    private IFAgregarUsuario IFA;
    private tecnico tecnico;
    private Secretaria secretaria;
    private Cliente cliente;

    public Controlador_Usuario() {
        this.cliente = null;
    }
        
    public boolean guardarTecnico(IFAgregarUsuario IFA){
    BaseDatos bd= new BaseDatos("INSERT INTO `tecnicos`VALUES (?,?,?,?,?,?,?,?)");
    java.sql.Date fecha=new java.sql.Date(IFA.getTxtFecha().getDate().getTime());
    tecnico=new tecnico(IFA.getTxtcedula().getText(),IFA.getTxtnombreUsuario().getText(),fecha,IFA.getTxtTelefono().getText(),
            IFA.getTxtcorreo().getText(),Double.parseDouble(IFA.getTxtsalario().getText()),
        IFA.getTxtNombreUsu().getText(),IFA.getTxtcontraseña().getText());
    return bd.ejecutar(new Object[]{tecnico.getCedula(),tecnico.getNombre(),tecnico.getNacimiento(),tecnico.getCorreo(),tecnico.getNombre_usuario(),tecnico.getTelefono(),tecnico.getContrasena(),tecnico.getSalario()});
    }
    
    public boolean guardarSecretaria(IFAgregarUsuario IFA){
        BaseDatos bd=new BaseDatos("INSERT INTO `secretaria` VALUES (?,?,?,?,?,?,?)");
        java.sql.Date fecha=new java.sql.Date(IFA.getTxtFecha().getDate().getTime());
         secretaria=new Secretaria(IFA.getTxtcedula().getText(),IFA.getTxtnombreUsuario().getText(),fecha,
                  IFA.getTxtTelefono().getText(),IFA.getTxtcorreo().getText(),IFA.getTxtNombreUsu().getText(),
                  IFA.getTxtcontraseña().getText());
        System.out.println(this.secretaria.getNacimiento());
      return  bd.ejecutar(new Object[]{secretaria.getCedula(),secretaria.getNombre(),secretaria.getTelefono(),
        secretaria.getNacimiento(),secretaria.getCorreo(),secretaria.getNombre_usuario(),secretaria.getContrasena()});   
    }

public void eliminartecnico(IFEliminarUsuario IFE){
    BaseDatos bd= new BaseDatos("DELETE FROM `tecnicos` WHERE cedula=?");
    this.tecnico=new tecnico();
    this.tecnico.setCedula(IFE.getTxtBuscar().getText());
    bd.ejecutar(new Object[]{this.tecnico.getCedula()});
}    

public void actualizartecnico(IFAcutalizarUsuario IFAA){
    BaseDatos bd= new BaseDatos("UPDATE `tecnicos` SET `Nombre`=?,`fecha de nacimiento`=?,`correo`=?,`Usuario`=?,`telefono`=?,`contraseña`=?,`salario`=? WHERE cedula=?");
    java.sql.Date fecha=new java.sql.Date(IFAA.getTxtFecha().getDate().getTime());
    this.tecnico=new tecnico(IFAA.getTxtcedula().getText(),IFAA.getTxtnombreUsuario().getText(),fecha,IFAA.getTxtTelefono().getText(),IFAA.getTxtcorreo().getText(),Double.parseDouble(IFAA.getTxtsalario().getText()),IFAA.getTxtNombreUsu().getText(), IFAA.getTxtcontraseña().getText());
    bd.ejecutar(new Object[]{this.tecnico.getNombre(),this.tecnico.getNacimiento(),this.tecnico.getCorreo(),this.tecnico.getNombre_usuario(),this.tecnico.getTelefono(),this.tecnico.getContrasena(),this.tecnico.getSalario(),this.tecnico.getCedula()});
}
public void eliminarsecretaria(IFEliminarUsuario IFE){
 BaseDatos bd= new BaseDatos("DELETE FROM `secretaria` WHERE cedula=?");
    this.secretaria=new Secretaria();
    this.secretaria.setCedula(IFE.getTxtBuscar().getText());
    bd.ejecutar(new Object[]{this.secretaria.getCedula()});
}

public void actualizarsecretaria(IFAcutalizarUsuario IFAA){
 BaseDatos bd= new BaseDatos("UPDATE `secretaria` SET `Nombre`=?,`telefono`=?,`fecha`=?,`correo`=?,`usuario`=? WHERE cedula=?");
 java.sql.Date fecha=new java.sql.Date(IFAA.getTxtFecha().getDate().getTime());
 this.secretaria=new Secretaria(IFAA.getTxtcedula().getText(),IFAA.getTxtnombreUsuario().getText(), fecha,IFAA.getTxtTelefono().getText(), IFAA.getTxtcorreo().getText(),IFAA.getTxtNombreUsu().getText(),IFAA.getTxtcontraseña().getText());
 bd.ejecutar(new Object[]{this.secretaria.getNombre(),this.secretaria.getTelefono(),this.secretaria.getNacimiento(),this.secretaria.getCorreo(),this.secretaria.getNombre_usuario(),this.secretaria.getCedula()});
}

public void buscarsecretaria(IFAcutalizarUsuario IFAA){
BaseDatos bd= new BaseDatos("SELECT * FROM `secretaria` WHERE cedula=?");
this.secretaria= new Secretaria();
this.secretaria.setCedula(IFAA.getTxtcedula().getText());
bd.ejecutar(new Object[]{this.secretaria.getCedula()});
Object obj[];
obj=bd.getOject();
    if (obj!=null) {
        IFAA.setTxtnombreUsuario((String) obj[1]);
        IFAA.setTxtTelefono((String) obj[2]);
        IFAA.setTxtcorreo((String) obj[4]);
        IFAA.setTxtNombreUsu((String) obj[5]);
        IFAA.setTxtFecha((Date) obj[3]);
    }else{
     IFAA.setTxtnombreUsuario(null);
        IFAA.setTxtTelefono(null);
        IFAA.setTxtcorreo(null);
        IFAA.setTxtNombreUsu(null);
        IFAA.setTxtFecha(null);
    }
}

public void buscarsecretaria3(IFBuscarUsuario IFB){
BaseDatos bd= new BaseDatos("SELECT * FROM `secretaria` WHERE cedula=?");
this.secretaria= new Secretaria();
this.secretaria.setCedula(IFB.getTxtCedula().getText());
bd.ejecutar(new Object[]{this.secretaria.getCedula()});
Object obj[];
DefaultTableModel modelo=(DefaultTableModel)  IFB.getTablaUsuario().getModel(); 
modelo.setNumRows(0);
  do {
      obj=bd.getOject();
      if (obj!=null) {
     
                modelo.addRow(obj);
            }
        } while (obj!=null);
  
}

public void filtrarsecretaria(IFBuscarUsuario IFB){
BaseDatos bd= new BaseDatos("SELECT * FROM `secretaria` WHERE Nombre like ?");
this.secretaria= new Secretaria();
this.secretaria.setNombre(IFB.getTxtNombre().getText());
bd.ejecutar(new Object[]{"%"+this.secretaria.getNombre()+"%"});
Object obj[];
DefaultTableModel modelo=(DefaultTableModel)  IFB.getTablaUsuario().getModel(); 
modelo.setNumRows(0);
  do {
      obj=bd.getOject();
      if (obj!=null) {
     
                modelo.addRow(obj);
            }
        } while (obj!=null);
  
}

public void buscartecnico(IFAcutalizarUsuario IFAA){
BaseDatos bd= new BaseDatos("SELECT * FROM `tecnicos` WHERE cedula=?");
this.tecnico= new tecnico();
this.tecnico.setCedula(IFAA.getTxtcedula().getText());
bd.ejecutar(new Object[]{this.tecnico.getCedula()});
Object obj[];
obj=bd.getOject();
    if (obj!=null) {
        IFAA.setTxtnombreUsuario((String) obj[1]);
        IFAA.setTxtTelefono((String) obj[5]);
        IFAA.setTxtcorreo((String) obj[3]);
        IFAA.setTxtNombreUsu((String) obj[4]);
        IFAA.setTxtFecha((Date) obj[2]);
        IFAA.setTxtsalario((Double) obj[7]);
    }else{
     IFAA.setTxtnombreUsuario(null);
        IFAA.setTxtTelefono(null);
        IFAA.setTxtcorreo(null);
        IFAA.setTxtNombreUsu(null);
        IFAA.setTxtFecha(null);
        IFAA.setTxtsalario(null);
    }
}

public void buscartecnico3(IFBuscarUsuario IFB){
BaseDatos bd= new BaseDatos("SELECT * FROM `tecnicos` WHERE cedula=?");
this.tecnico= new tecnico();
this.tecnico.setCedula(IFB.getTxtCedula().getText());
bd.ejecutar(new Object[]{this.tecnico.getCedula()});
Object obj[];
DefaultTableModel modelo=(DefaultTableModel)  IFB.getTablaUsuario().getModel(); 
modelo.setNumRows(0);
  do {
      obj=bd.getOject();
      if (obj!=null) {
     
                modelo.addRow(obj);
            }
        } while (obj!=null);
  
}

public void flitrartecnico(IFBuscarUsuario IFB){
BaseDatos bd= new BaseDatos("SELECT * FROM `tecnicos` WHERE Nombre like ?");
this.tecnico= new tecnico();
this.tecnico.setNombre(IFB.getTxtNombre().getText());
bd.ejecutar(new Object[]{"%"+this.tecnico.getNombre()+"%"});
Object obj[];
 DefaultTableModel modelo=(DefaultTableModel)  IFB.getTablaUsuario().getModel(); 
 modelo.setNumRows(0);
do {
      obj=bd.getOject();
      if (obj!=null) {
                modelo.addRow(obj);
            }
        } while (obj!=null);
}

public boolean buscarsecretaria2(IFEliminarUsuario IFE){
BaseDatos bd= new BaseDatos("SELECT * FROM `secretaria` WHERE cedula=?");
this.secretaria= new Secretaria();
this.secretaria.setCedula(IFE.getTxtBuscar().getText());
bd.ejecutar(new Object[]{this.secretaria.getCedula()});
Object obj[];
obj=bd.getOject();
    if (obj!=null) {
        return true;
    }else{
    return false;
    }
}

public boolean buscartecnico2(IFEliminarUsuario IFE){
BaseDatos bd= new BaseDatos("SELECT * FROM `tecnicos` WHERE cedula=?");
this.tecnico= new tecnico();
this.tecnico.setCedula(IFE.getTxtBuscar().getText());
bd.ejecutar(new Object[]{this.tecnico.getCedula()});
Object obj[];
obj=bd.getOject();
    if (obj!=null) {
      
        return true;
    }else{
   
                return false;
    }
}

}
