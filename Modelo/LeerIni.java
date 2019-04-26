package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


/**
 *
 * @author juan_
 */
public class LeerIni {
    
    private Properties parametro;
   

    public Properties getParametro() {
        return parametro;
    }
    public void LeerArIni(String ruta){
        try {
            this.parametro=new Properties();
           this.parametro.load(new FileReader(ruta));
        } catch (FileNotFoundException ex) {
            System.out.println("No hay archivo");
        } catch (IOException ex) {
            System.out.println("No se puede leer");
        }
        
    }
}
