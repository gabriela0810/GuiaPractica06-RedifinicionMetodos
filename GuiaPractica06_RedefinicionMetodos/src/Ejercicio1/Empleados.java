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
public class Empleados {
    public String nombre;
    public String direccion;
    public String puesto;
    public int telefono;
    public double salario;

    public Empleados() {
    }
    public Empleados(String nombre, String direccion, String puesto, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.puesto = puesto;
        this.telefono = telefono;
    }
    public Empleados(String nombre, String direccion, String puesto, int telefono, double salario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.puesto = puesto;
        this.telefono = telefono;
        this.salario = salario;
    }
    
    public String infoEmpleado(){
        String info="Nombre: " + this.nombre + "\n" + 
                    "Dirección: " + this.direccion + "\n" + 
                    "Puesto: " + this.puesto + "\n" + 
                    "Telefono: " + this.telefono + "\n";
        return info;
    }
    
    public String salario(){
        String msj="Tu Salario es Normal. $" + this.salario;
        return msj;
    }
    
}
