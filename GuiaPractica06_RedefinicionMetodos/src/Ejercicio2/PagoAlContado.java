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
public class PagoAlContado extends Pagos{
    public double desceuntoPorPago;

    public PagoAlContado(int numeroCuenta, String titular) {
        super(numeroCuenta, titular);
        this.desceuntoPorPago=0.10;
    }

    

    @Override
    public String infoCliente() {
        String info="Descuento por el tipo de pago: %" + this.desceuntoPorPago + 
                    "\nTotal a Pagar: $" + this.pago;
        return super.infoCliente() + info; 
    }

    @Override
    public void pagar(double pg) {
        this.pago=pg-(pg*this.desceuntoPorPago);
    }
    
}
