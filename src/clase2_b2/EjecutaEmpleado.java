/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2_b2;

import java.util.Scanner;

/**
 *
 * @author Luz Ma
 */
public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1, para realizar el calculo de sueldo EMPLEADO POR HORAS");
        System.out.println("Digite 2, para realizar el caluclo de sueldo EMPLEADO ASALARIADO");
        int opcion = sc.nextInt();
        
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el departamento que pertenece el empleado: ");
        String departamento = sc.nextLine();
        System.out.println("Ingrese el puesto del empleado: ");
        String puesto = sc.nextLine();
        if(opcion == 1){ //calcular suedlo para empleado por horas
            
            System.out.print("\nIngrese horas trabajadas en la quincena por empleado: ");
            int horas = sc.nextInt();
            System.out.print("\nIngrese el valor de la cuota por hora: ");
            double cuota = sc.nextDouble();
            
            EmpleadoPorHoras empHoras = new EmpleadoPorHoras();
            empHoras.setNombre(nombre);
            empHoras.setDepartamento(departamento);
            empHoras.setPuesto(puesto);
            empHoras.setHoras(horas);
            empHoras.setCuota(cuota);
            empHoras.calcular_suledo_quincenal();
            System.out.println("El sueldo a pagar a "+empHoras.getNombre()+" es: $"+empHoras.getSueldo_quincenal());
        }else if(opcion == 2){ //calcular sueldo quincenal para empleado asalariado
            System.out.println("Ingrese el suelo mensual: ");
            int sueldo = sc.nextInt();
            
            EmpleadoAsalariado empAsalariado = new EmpleadoAsalariado();
            empAsalariado.setNombre(nombre);
            empAsalariado.setDepartamento(departamento);
            empAsalariado.setPuesto(puesto);
            empAsalariado.setSueldo_mensual(sueldo);
            
        }
    }
}
