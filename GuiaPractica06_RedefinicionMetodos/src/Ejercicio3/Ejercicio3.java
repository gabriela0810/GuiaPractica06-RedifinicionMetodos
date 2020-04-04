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
public class Ejercicio3 {
    public static void main(String[] args) {
        Audio myAudio=new Audio(75, "MIDDLE OF THE NIGHT", 3.39, "MP3");
        Video myVideo=new Video(1080, "Drácula: La historia jamás contada", 1392, "MP4");
                
        System.out.println("*********************AUDIO*********************");
        System.out.println(myAudio.infoMultimedia());
        System.out.println(myAudio.reproducir());
        
        System.out.println("\n*********************VIDEO*********************");
        System.out.println(myVideo.infoMultimedia());
        System.out.println(myVideo.reproducir());
        
    }
}
