/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author jenni
 */
public class EmpleadoPorComision extends Empleados{
    public double comision;

    public EmpleadoPorComision(double comision, String nombre, String direccion, String puesto, int telefono, double salario) {
        super(nombre, direccion, puesto, telefono, salario);
        this.comision = comision;
    }

    @Override
    public String infoEmpleado() {
        String info="Salario: $" + this.salario + "\n" +
                    "Comisión Ganada: $" + this.comision;
        return super.infoEmpleado() + info;
    }

    @Override
    public String salario() {
        String msj="Su salario más la suma de su comisión es: $" + (this.salario+this.comision);
        return msj;
    }
    
}
