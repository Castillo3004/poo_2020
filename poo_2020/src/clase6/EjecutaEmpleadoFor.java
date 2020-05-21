/*
 Integrantes: 
 *Andres Jimenez 
 *Carlo Castillo
 */
package clase6;

import java.util.Scanner;

public class EjecutaEmpleadoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre; 
        int horas;
        double cuota;
        int num; 
        int aux = 0; 
        double sueldoT = 0;
        String cadena = null; 
        System.out.println("Digite el numero de empleados de los cuales va a ingresar sus datos: ");
        num = sc.nextInt();
        for(int i =0;i<num;i ++){
            System.out.println("____________________________________________");
            System.out.println("Ingrese el nombre de el "+(i+1)+ "° empleado: ");
            nombre = sc.next();
            System.out.println("Ingrese el número de horas trabajadas de "+nombre+": ");
            horas = sc.nextInt();
            System.out.println("Ingrese la cuota por hora de "+nombre+": ");
            cuota = sc.nextDouble();
            Empleado empleado = new Empleado(nombre, horas, cuota);
            empleado.calcularSueldo();
            cadena += ("Nombre del empleado: "+empleado.getNombre()+"\nCuota por hora de "+empleado.getCuota()+"\nSueldo a cobrar: "+empleado.getSueldo());
            System.out.println("_____________________________");
            sueldoT += empleado.getSueldo();
            aux ++;   
        }
        System.out.println("\n\nREPORTE FINAL ");
        System.out.println("=============\n");
        System.out.println(cadena);
        System.out.println("_________________________________________________________");
        System.out.println("Usted ha ingresado en total "+aux+" empleados");
        System.out.println("El sueldo total de los "+aux+" trabajadores es:"+sueldoT);
        System.out.println("_________________________________________________________");
    }
}
