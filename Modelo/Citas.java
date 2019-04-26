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
public class Citas {
 private int id;
 private Date fecha;
 private String hora;
 private String placa;
 private String sucursal;


    public Citas(Date fecha, String hora, String placa,String surcusal) {
        this.id = 0;
        this.fecha = fecha;
        this.hora = hora;
        this.placa = placa;
        this.sucursal=surcusal;
    }

    public Citas() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
 
 
    
    
    
    
}
