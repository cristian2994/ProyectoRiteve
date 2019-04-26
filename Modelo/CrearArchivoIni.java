package Modelo;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan_
 */
public class CrearArchivoIni {
    
    protected NodeList listaCaracteristicas;
    protected Node nodo;
    private String Nombre;
    private String Ruta;
    private String Tipo;
    private File Archivo;
    private BufferedWriter Escritor;
    private BufferedReader Lector;
    protected String complet;

    public CrearArchivoIni(String Ruta) {
        this.Nombre = "conexion";
        this.Ruta = Ruta;
        this.Tipo = ".ini";
        this.Abrir();
    }

    public void Abrir() {
        try {
            Archivo = new File(this.Ruta + "\\" + this.Nombre + this.Tipo);
            if (!Existe()) {
                this.Crear();
                Lector = new BufferedReader(new FileReader(Archivo));
                Escritor = new BufferedWriter(new FileWriter(Archivo, true));
                Escribir("[Caracteristicas]");
                Escribir("ip=");
                Escribir("bd=");
                Escribir("contra=");
                Escribir("usuario=");
                Escribir("Ruta=");
                Guardar();
            }
            Lector = new BufferedReader(new FileReader(Archivo));
            Escritor = new BufferedWriter(new FileWriter(Archivo, true));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CrearArchivoIni.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CrearArchivoIni.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Cerrar() {
        try {
            Lector.close();
            Escritor.close();
        } catch (IOException ex) {
            Logger.getLogger(CrearArchivoIni.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Crear() {
        try {
            this.Archivo.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(CrearArchivoIni.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean Existe() {
        return this.Archivo.exists();
    }

    public void Guardar() {
        try {
            this.Escritor.flush();
        } catch (IOException ex) {
            Logger.getLogger(CrearArchivoIni.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String Leer() {
        try {
            return this.Lector.readLine();
        } catch (IOException ex) {
            Logger.getLogger(CrearArchivoIni.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void Escribir(String texto) {
        try {
            this.Escritor.write(texto);
            this.Escritor.newLine();
        } catch (IOException ex) {
            Logger.getLogger(CrearArchivoIni.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Eliminar() {
        this.Archivo.delete();
    }

    public void Limpiar() {
        try {
            BufferedWriter Escritor = new BufferedWriter(new FileWriter(this.Archivo, false));
        } catch (IOException ex) {
            Logger.getLogger(CrearArchivoIni.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cambiarNombre(String nombre) {
        File nuevoArchivo = new File(nombre);
        this.Archivo.renameTo(nuevoArchivo);
    }
}
