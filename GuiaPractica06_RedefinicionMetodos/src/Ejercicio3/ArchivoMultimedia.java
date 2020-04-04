/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author jenni
 */
public class ArchivoMultimedia {
    public String nombreArchivo;
    public double tamañoArchivo;
    public String tipoArchivo;

    public ArchivoMultimedia() {
    }

    public ArchivoMultimedia(String nombreArchivo, double tamañoArchivo, String tipoArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.tamañoArchivo = tamañoArchivo;
        this.tipoArchivo = tipoArchivo;
    }
    
    public String infoMultimedia(){
        String info="Nombre del Archivo: " + this.nombreArchivo + "\n" +
                    "Tamaño del Archivo: " + this.tamañoArchivo + "MB\n" +
                    "Tipo del Archivo: " + this.tipoArchivo + "\n";
        return info;
    }
    
    public String reproducir(){
        String msj="Se esta reproduciendo un Archivo Multimedia";
        return msj;
    }
}
