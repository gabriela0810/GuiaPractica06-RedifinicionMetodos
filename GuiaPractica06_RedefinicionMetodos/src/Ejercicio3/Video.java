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
public class Video extends ArchivoMultimedia{
    public int calidadVideo;

    public Video(int calidadVideo, String nombreArchivo, double tamañoArchivo, String tipoArchivo) {
        super(nombreArchivo, tamañoArchivo, tipoArchivo);
        this.calidadVideo = calidadVideo;
    }

    @Override
    public String infoMultimedia() {
        String info="Calidad del Video: " + this.calidadVideo + "p";
        return super.infoMultimedia()+ info;
    }

    @Override
    public String reproducir() {
        String msj="Se esta reproduciendo el VIDEO " + this.nombreArchivo;
        return msj;
    }
    
}
