/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;
import java.util.Scanner;

/**
 *
 * @author Luz Ma
 */
public class EjecutaVehiculo {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //creacion de objeto a partir de la calse vehiculo 
        Vehiculo objVehiculo = new Vehiculo();
        System.out.println("REGISTRO DE DATOS PARA VEHICULO COMPETIDOR");
        System.out.print("Ingrese el nombre del piloto: ");
        String nombre = sc.nextLine(); //receptamos el valor en la variable nombre
        objVehiculo.setPiloto(nombre);
        System.out.print("Ingrese la placa del vehiculo: ");
        objVehiculo.setPlaca(sc.nextLine()); //Obtenemos valor desde el teclado y lo establecemos en placa 
        System.out.print("Ingrese la velocidad del vehiculo: ");
        objVehiculo.setVelocidad(sc.nextDouble()); //Obtenemos valor de tipo double desde el teclado y lo pasamos 
                                                  //al metodo setVelocidad
        System.out.println("\nFICHA DE REGISTRO DEL VEHICULO");
        System.out.println("==============================");
        
        System.out.println("\nPiloto: "+objVehiculo.getPiloto()+"\nPlaca: "+objVehiculo.getPlaca()+"\nVelocidad llegada: "+objVehiculo.getVelocidad()+" km/h");
        
        System.out.println("CREACION DE UN SEGUNDO OBJETO");
        Vehiculo objVehiculo2 = new Vehiculo();
        objVehiculo2.setPiloto("Jose");
        System.out.println("Nombre del piloto: "+objVehiculo2.getPiloto());       
    }
}
