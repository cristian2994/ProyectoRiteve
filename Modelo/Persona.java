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
public class Persona {
    private String cedula;
    private String nombre;
    private Date nacimiento;
    private String telefono;
    private String correo;
    private double salario;
    private String nombre_usuario;
    private String contrasena;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

   

    public Persona(String cedula, String nombre, Date nacimiento, String telefono,
            String correo, String nombre_usuario, String contrasena) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
    }
    public Persona(String cedula, String nombre, Date nacimiento, String telefono,
            String correo,double salario, String nombre_usuario, String contrasena) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.salario=salario;
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
    }

    public Persona(String cedula, String nombre, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono=telefono;
    }

    public Persona(double salario){
    this.salario=salario;
    }
    public Persona() {
    }
    
    
    
    
    
    
    
    
}
