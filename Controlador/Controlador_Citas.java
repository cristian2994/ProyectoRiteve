/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.BaseDatos;
import Modelo.Citas;
import Modelo.Vehiculos;
import Vista.IFAgregaryActualizarCitas;
import Vista.IFAgregarVehiculo;
import Vista.IFBuscarCita;
import Vista.IFEliminarCitas;
import java.sql.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cristian Lopez
 */
public class Controlador_Citas {
     private IFAgregaryActualizarCitas IFAC ;
    private Vehiculos vehiculo;
    private Citas CITA;
   
    public Controlador_Citas() {
        this.CITA = null;
    }
    
 
    public boolean guardarCita(IFAgregaryActualizarCitas IFAC){
    BaseDatos bd= new BaseDatos("INSERT INTO `citas`VALUES (?,?,?,?,?)");
    java.sql.Date fecha=new java.sql.Date(IFAC.getTxtFecha().getDate().getTime());
    CITA=new Citas(fecha,IFAC.getHora(),IFAC.getTxtPlaca().getText(), (String) IFAC.getComboBoxSucursal().getSelectedItem());
        return bd.ejecutar(new Object[]{0,CITA.getFecha(),CITA.getHora(),CITA.getPlaca(),CITA.getSucursal()});
    }

        
   public boolean comprobarPlaca(IFAgregaryActualizarCitas IFAC){
   BaseDatos bd= new BaseDatos("Select Placa from vehiculo where Placa=?");
    this.vehiculo=new Vehiculos();
    this.vehiculo.setPlaca(IFAC.getTxtPlaca().getText());
    bd.ejecutar(new Object[]{this.vehiculo.getPlaca()});
    Object obj[];
        obj=bd.getOject();
        if (obj==null) {
           return true;
       }else{
            if (obj[0].equals(this.vehiculo.getPlaca())) {
                return false;
            }
        }
        return true;
   }  
        public String antiguedad(IFAgregaryActualizarCitas IFAC){
            BaseDatos bd= new BaseDatos("Select * from vehiculo where Placa=?");
    this.vehiculo=new Vehiculos();
    this.vehiculo.setPlaca(IFAC.getTxtPlaca().getText());
    bd.ejecutar(new Object[]{this.vehiculo.getPlaca()});
    Object obj[];
    obj=bd.getOject();
           return vehiculo.calcularAniodeinscripcion(obj[3]);
        }
    public void mostrarvehiculo(IFAgregaryActualizarCitas IFAC){
    BaseDatos bd= new BaseDatos("SELECT * FROM `vehiculo` WHERE Placa=?");
    this.vehiculo=new Vehiculos();
    this.vehiculo.setPlaca(IFAC.getTxtPlaca().getText());
    bd.ejecutar(new Object[]{this.vehiculo.getPlaca()});
    Object obj[];
    obj=bd.getOject();
        DefaultTableModel modelo= (DefaultTableModel) IFAC.getTablaVehiculo().getModel();
        modelo.addRow(obj);
    }
    
    public void actualizarcita(IFAgregaryActualizarCitas IFAC){
    BaseDatos bd= new BaseDatos("UPDATE `citas` SET `fecha`=?,`hora`=?,`sucursal`=? WHERE `placa del vehiculo`=? ");
    java.sql.Date fecha=new java.sql.Date(IFAC.getTxtFecha().getDate().getTime());
    this.CITA= new Citas(fecha,IFAC.getHora(),IFAC.getTxtPlaca().getText(), (String) IFAC.getComboBoxSucursal().getSelectedItem());
    bd.ejecutar(new Object[]{this.CITA.getFecha(),this.CITA.getHora(),this.CITA.getSucursal(),this.CITA.getPlaca()});
    }
    
   public void eliminarcita(IFAgregaryActualizarCitas IFAC){
   BaseDatos bd = new BaseDatos("DELETE FROM `citas` WHERE `placa del vehiculo`=? ");
   this.CITA=new Citas();
   this.CITA.setPlaca(IFAC.getTxtPlaca().getText());
   bd.ejecutar(new Object[]{this.CITA.getPlaca()});
   }
        
   public void buscarcitas(IFBuscarCita IFBC){
   BaseDatos bd= new BaseDatos("SELECT * FROM `citas` JOIN vehiculo on citas.placa = vehiculo.Placa");
   bd.Ejecutar();
   Object obj[];
    DefaultTableModel modelo= (DefaultTableModel) IFBC.getTablaCitas().getModel();
    modelo.setNumRows(0);
       do {
            obj=bd.getOject();
            if (obj!=null) {               
                modelo.addRow(obj);
            }
        } while (obj!=null);
   }
   
   public void buscarcitasporplaca(IFBuscarCita IFBC){
   BaseDatos bd= new BaseDatos("SELECT * FROM `citas` where placa=?");
   this.CITA= new Citas();
   this.CITA.setPlaca(IFBC.getTxtBuscar().getText());
   bd.ejecutar(new Object[]{this.CITA.getPlaca()});
   Object obj[];
    DefaultTableModel modelo= (DefaultTableModel) IFBC.getTablaCitas().getModel();
    modelo.setNumRows(0);
      obj=bd.getOject();
                modelo.addRow(obj);     
   }
   
   
   
    public void eliminarCita(IFEliminarCitas IFEC){
 BaseDatos bd= new BaseDatos("DELETE FROM `Citas` WHERE id=?");
    this.CITA=new Citas();
    this.CITA.setId((Integer.parseInt(IFEC.getTxteliminarCita().getText())));
    bd.ejecutar(new Object[]{this.CITA.getId()});
}

   
   
   
   
   
}
