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
public class Audio extends ArchivoMultimedia{
    public int frecuenciaAudio;

    public Audio(int frecuenciaAudio, String nombreArchivo, double tamañoArchivo, String tipoArchivo) {
        super(nombreArchivo, tamañoArchivo, tipoArchivo);
        this.frecuenciaAudio = frecuenciaAudio;
    }

    @Override
    public String infoMultimedia() {
        String info="Frecuencia del Audio: " + this.frecuenciaAudio + "Hz";
        return super.infoMultimedia()+ info;
    }
    
    

    @Override
    public String reproducir() {
        String msj="Se esta reproduciendo el AUDIO " + this.nombreArchivo;
        return msj;
    }
    
}
