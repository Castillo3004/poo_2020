/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

/**
 *
 * @author Luz Ma
 */
public class EjecutaVehiculo {
    public static void main(String[] args) {
        //Creación de objeto Vehiculo con constructor por defecto
       /* Vehiculo objVehiculo = new Vehiculo();
        objVehiculo.setPiloto("Carlos");
        String piloto = objVehiculo.getPiloto();
        System.out.println("El nombre del piloto es: "+piloto);*/
        
        //Vehiculo objVehiculo2 = new Vehiculo("LBA-677", "Carlos");
        //objVehiculo2.getPiloto();
        //String piloto = objVehiculo2.getPiloto();
        //System.out.println("El nombre del piloto es: "+ piloto);
        Vehiculo objVehiculo3 = new Vehiculo(120, "PSU-677");
        objVehiculo3.setPiloto("Carlos");
        System.out.println("El nombre del piloto es: "+objVehiculo3.getPiloto());
        
    }
}
