
package clase5;

import java.util.Scanner;


public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre; 
        int hora; 
        double cuota; 
        Empleado objEmpleado = new Empleado();
        System.out.println("PROGRAMA PARA REALZIAR EL CALUCLO DE SUELDO DE UN TRABAJADOR");
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el valor de la cuota por hora: ");
        cuota = sc.nextDouble();
        System.out.print("Ingrese el numero de horas trabajadas: ");
        hora = sc.nextInt();
        
        objEmpleado.setNombre(nombre);
        objEmpleado.setCuota(cuota);
        objEmpleado.setHoras(hora);
        
        objEmpleado.calcularSueldo();
        
        System.out.println("Nombre del empleado: "+nombre);
        System.out.println("Sueldo a pagar: $ "+objEmpleado.getSueldo());
    }
}
