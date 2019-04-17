/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juan_
 */
public class LeerIni {
    
    private Properties parametro;
    private String Ruta;

    public Properties getParametro() {
        return parametro;
    }

    public LeerIni(String Ruta) {
        this.Ruta = Ruta;
        this.LeerArIni();
    }
    private void LeerArIni(){
        try {
            this.parametro=new Properties();
            parametro.load(new FileReader(this.Ruta));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerIni.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerIni.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
