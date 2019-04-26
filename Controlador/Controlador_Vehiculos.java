/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.BaseDatos;
import Modelo.Citas;
import Modelo.Cliente;
import Modelo.Secretaria;
import Modelo.Vehiculos;
import Modelo.tecnico;
import Vista.IFActulizarVehiculo;
import Vista.IFAgregarUsuario;
import Vista.IFAgregarVehiculo;
import Vista.IFEliminarVehiculo;

/**
 *
 * @author Cristian Lopez
 */
public class Controlador_Vehiculos {
     private IFAgregarVehiculo IFAV ;
     private IFEliminarVehiculo IFEV;
     private Vehiculos vehiculo;
     private Citas cita;
     
   
    public Controlador_Vehiculos() {
        
        this.vehiculo = null;
    }
    
    
    public boolean guardarVehiculo(IFAgregarVehiculo IFAV){
    BaseDatos bd= new BaseDatos("INSERT INTO `vehiculo`VALUES (?,?,?,?,?,?)");
    vehiculo=new Vehiculos(IFAV.getTxtPlaca().getText(),IFAV.getTxtPropietario().getText(),IFAV.getTxtCedulaPropietario().getText(),
        Integer.parseInt(IFAV.getTxtAñoIscripcion().getText()),IFAV.getTxtmarca().getText(),(IFAV.getTxtmodelo().getText()));
        return bd.ejecutar(new Object[]{vehiculo.getPlaca(),vehiculo.getPropietario(),vehiculo.getCedula(),
        vehiculo.getAñoDEinscrpcion(),vehiculo.getMarca(),vehiculo.getModelo()});
    }
    
    public void actualizVehiculo(IFActulizarVehiculo IFAV){
    BaseDatos bd= new BaseDatos("UPDATE `vehiculo` SET `propietario`=?,`anio de inscripción`=?,`marca`=?,`modelo`=? WHERE Placa=?");
    this.vehiculo=new Vehiculos(IFAV.getTxtPlaca().getText(), IFAV.getTxtPropietario().getText(),IFAV.getTxtCedulaPropietario().getText(),Integer.parseInt(IFAV.getTxtAñoIscripcion().getText()),IFAV.getTxtmarca().getText(),IFAV.getTxtmodelo().getText());
    bd.ejecutar(new Object[]{this.vehiculo.getPropietario(),this.vehiculo.getAñoDEinscrpcion(),this.vehiculo.getMarca(),this.vehiculo.getModelo(),this.vehiculo.getPlaca()});
}
    public void eliminarVehiculo(IFEliminarVehiculo IFEV){
 BaseDatos bd= new BaseDatos("DELETE FROM `vehiculo` WHERE Placa=?");
    this.vehiculo=new Vehiculos();
    this.vehiculo.setPlaca(IFEV.getTxteliminarVehiculo().getText());
    bd.ejecutar(new Object[]{this.vehiculo.getPlaca()});
}

    
    
    
}
