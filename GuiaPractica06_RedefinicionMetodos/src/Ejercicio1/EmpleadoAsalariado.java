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
public class EmpleadoAsalariado extends Empleados{
    public String empresaProveedora;

    public EmpleadoAsalariado(String empresaProveedora, String nombre, String direccion, String puesto, int telefono, double salario) {
        super(nombre, direccion, puesto, telefono, salario);
        this.empresaProveedora = empresaProveedora;
    }

    @Override
    public String infoEmpleado() {
        String info="Empresa Proveedora del Empleado: " + this.empresaProveedora;
        return super.infoEmpleado() + info;
    }
    
    

    @Override
    public String salario() {
        String msj="Su Salario es: $" + this.salario;
        return msj;
    }
    
}
