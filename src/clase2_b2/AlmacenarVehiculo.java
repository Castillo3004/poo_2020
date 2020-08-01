/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2_b2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Luz Ma
 */
public class AlmacenarVehiculo {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
       List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
       String repetir = "Si";
       while(repetir.equals("Si")){
           
           System.out.println("Ingrese la placa del vehiculo: ");
           String placa = sc.nextLine();
           System.out.println("Ingrese el color del vehiculo: ");
           String color = sc.nextLine();
           System.out.println("Ingrese la marca del vehiculo: ");
           String marca = sc.nextLine();
           
           Vehiculo objVehiculo = new Vehiculo(placa, marca,color);
           vehiculos.add(vehiculo);
           System.out.println("Desea ingresar datos para ");
           repetir = sc.nextLine();
           
       }
        System.out.println("MOSTRAR ELEMENTOS LA LISTA DE VEHICULO");
        
        for(Vehiculo vh: vehiculos){
            System.out.println("Placa: "+vh.getPlaca());
            System.out.println("Modelo: "+vh.getModelo());
            System.out.println("Color: "+vh.getColor());
            System.out.println("_______________________________");
        }
        
        
        //Proceso para eliminar un elemento, dad la placa del vehiculo
        System.out.println("Ingrese la placa del vehiculo a eliminar: ");
        String placa_eliminada = sc.nextLine();
        int cont =0;
        boolean existe = false;
        for(Vehiculo vh: vehiculos){
            cont++;
            if(vh.getPlaca().equals(placa_eliminada)){
                existe = true; 
                break;
            }
        }
        cont -= 1;
        
        if(existe == true)
            vehiculos.remove(cont);
        
        vehiculos.remove(cont);
        System.out.println("PRESENTAR LISTA MENOS EL ELEMENTO ELIMINADO");
        for(Vehiculo vh: vehiculos){
            System.out.println("Placa: "+vh.getPlaca());
            System.out.println("Modelo: "+vh.getModelo());
            System.out.println("Color: "+vh.getColor());
            System.out.println("_______________________________");
        }
       
    }
}
