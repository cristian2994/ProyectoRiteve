/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Cristian Lopez
 */
public class Vehiculos {
    
 private String placa;
 private String marca;
 private String modelo;
 private int añoDEinscrpcion;
 private String propietario;
 private String cedula;

    public Vehiculos() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoDEinscrpcion() {
        return añoDEinscrpcion;
    }

    public void setAñoDEinscrpcion(int añoDEinscrpcion) {
        this.añoDEinscrpcion = añoDEinscrpcion;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Vehiculos(String placa, String propietario, String cedula, int añoDEinscrpcion, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.añoDEinscrpcion = añoDEinscrpcion;
        this.propietario = propietario;
        this.cedula = cedula;
    }
    
    public String calcularAniodeinscripcion(Object fecha){
        String fechaAntigua=String.valueOf(2019-(int)fecha);
        return fechaAntigua+" años de antiguedad";
    }
 

}
