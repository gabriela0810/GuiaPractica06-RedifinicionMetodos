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
public class Ejercicio1 {
    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsala=new EmpleadoAsalariado("Banco Agricola", "Krissia Preza", "La Libertad", "Gerente", 23546789, 400.00);
        EmpleadosPorHoras empleadoHora=new EmpleadosPorHoras(8, "Alejandro Rosales", "Santa Ana", "Cajero", 24567890);
        EmpleadoPorComision empleadoComi=new EmpleadoPorComision(350.00, "Eduardo Perez", "San Salvador", "Cajero", 24567190, 400.00);
        
        System.out.println("******************EMPLEADO ASALARIADO******************");
        System.out.println(empleadoAsala.infoEmpleado());
        System.out.println(empleadoAsala.salario());
        
        System.out.println("\n******************************************************");
        
        System.out.println("\n******************EMPLEADO POR HORAS******************");
        System.out.println(empleadoHora.infoEmpleado());
        System.out.println(empleadoHora.salario());
        
        System.out.println("\n******************************************************");
        
        System.out.println("\n****************EMPLEADO POR COMISIONES***************");
        System.out.println(empleadoComi.infoEmpleado());
        System.out.println(empleadoComi.salario());
        
    }
}
