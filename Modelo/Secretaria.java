/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author Cristian Lopez
 */
public class Secretaria extends Persona {

    public Secretaria(String cedula, String nombre, Date nacimiento, String telefono, String correo, String nombre_usuario, String contrasena) {
        super(cedula, nombre, nacimiento, telefono, correo, nombre_usuario, contrasena);
    }

    public Secretaria() {
    }
    

   
}
