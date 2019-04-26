/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.IFAgregarUsuario;
import java.sql.Date;

/**
 *
 * @author Cristian Lopez
 */
public class tecnico extends Persona {
    private IFAgregarUsuario IFA;
    public double salario;
    public Persona persona;

    public tecnico(String cedula, String nombre, Date nacimiento, String telefono,
            String correo,double salario, String nombre_usuario, String contrasena) {
        super(cedula, nombre, nacimiento, telefono, correo,salario, nombre_usuario, contrasena);
    }

    public tecnico() {
        
    }
//    public double CalcularSalario(){
//    
//    
//    }
    
    
}
