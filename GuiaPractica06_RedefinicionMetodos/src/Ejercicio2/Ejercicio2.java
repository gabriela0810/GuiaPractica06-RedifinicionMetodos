/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author jenni
 */
public class Ejercicio2 {
     public static void main(String[] args) {
        PagoAlContado pagoCont=new PagoAlContado(2211144, "Alejandro Perez");
        pagoCont.pagar(55.34);
        PagoTarjetaCredito pagoTarje=new PagoTarjetaCredito(01223345, 023376554, "Gabriela Cartagena");
        pagoTarje.pagar(245.00);
        
        System.out.println(pagoCont.infoCliente());
        System.out.println("\n********************************************************************\n");
        System.out.println(pagoTarje.infoCliente());
    }
}
