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
public class Pagos {
    public int numeroCuenta;
    public String titular;
    public double pago;

    public Pagos() {
    }

    public Pagos(int numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
    }
    
    public String infoCliente(){
        String info="Numero de Cuenta: " + this.numeroCuenta + "\n" + 
                    "Titular: " + this.titular + "\n";
        return info;
    }
    
    public void pagar(double pg){
        this.pago=pg;
    }
}
