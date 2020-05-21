/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

import java.util.Scanner;

/**
 *
 * @author Luz Ma
 */
public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre; 
        int horas;
        double cuota;
        char desea = 'n';
        do{
            System.out.println("Ingrese el nombre del empleado: ");
            nombre = sc.nextLine();
            System.out.println("Ingrese el numero de horas trabajadas: ");
            horas = sc.nextInt();
            System.out.println("Ingrese la cuota por hora: ");
            cuota = sc.nextDouble();
            
            Empleado empleado = new Empleado(nombre, horas, cuota);
            empleado.calcularSueldo();
            
            System.out.println("Nombre del empleado: "+empleado.getNombre());
            System.out.println("Cuota por hota: "+empleado.getCuota());
            System.out.println("Sueldo a cobrar: "+empleado.getSueldo());
            
            
            System.out.println("¿Desea ingresar otro empleado? Digite 's' para si y 'n' para no ");
            desea = sc.next().toLowerCase().charAt(0);
        }while(desea == 's');
    }
}
