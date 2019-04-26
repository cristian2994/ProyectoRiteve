/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.BaseDatos;
import Vista.FrmConexion;

/**
 *
 * @author Cristian Lopez
 */
public class Controlador_Conneccion {
    private FrmConexion conexion;

    public Controlador_Conneccion(FrmConexion conexion) {
        this.conexion = conexion;
    }
   public boolean LevantarServidor(){
   BaseDatos bd=new BaseDatos(conexion.getTxtIp().getText(),conexion.getClave().getText(),conexion.getTxtUsuariio().getText(),conexion.getTxtBd().getText());
    bd.setRuta(conexion.getTxtRuta().getText());
       return bd.levantarServidor()!=false;
   }
}
