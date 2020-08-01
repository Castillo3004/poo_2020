/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3_b2;

import java.util.Scanner;

/**
 *
 * @author Luz Ma
 */
public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULO DE SUELDO PARA EMPLEADOS");
        System.out.println("================================");
        System.out.println("Digite 1, para calcular sueldo empleado por horas");
        System.out.println("Digite 2, para calcular sueldo empleado asalariado");
        int opcion = sc.nextInt();
        sc.nextLine();
        //calculo sueldo de un empleado por horas 
        if(opcion ==1){
            EmpleadoPorHoras obj = new EmpleadoPorHoras();
            System.out.println("Ingrese numero de horas trabajdas: ");
            int horas = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese la cuota por hora trabajada: ");
            double cuota = sc.nextDouble();
            obj.setHoras(horas);
            obj.setCuota(cuota);
            obj.caluclarSueldoQna();
            System.out.println("Valor calculado a pagar: "+obj.getSueldo());
        }else if(opcion == 2){
            EmpleadoAsalariado obj = new EmpleadoAsalariado();
            System.out.println("Ingrese sueldo mensual: ");
            double sueldo_mensual = sc.nextDouble();
            obj.setSueldo_mensual(sueldo_mensual);
            obj.caluclarSueldoQna();
            System.out.println("Valor calculado a pagar: "+obj.getSueldo());
        }
        //calculo sueldo de empleado asalariado 
        
    }
}
