package clase4_deber;

import java.util.Scanner;

public class Ejecutar_calculo_terreno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("CALCULO DE UN TERRENO");
        System.out.println("=====================");
        System.out.println("Ingrese por favor el numero de el calculo que desee realizar: \n\n1.- Calcular el area del un terreno cuadrado. \n2.- Calcular el area del un terreno rectangular .");
        op = sc.nextInt();
        if(op == 1){
            Calculo_terreno Cuadrado = new Calculo_terreno();
            System.out.println("\nCALCULO DEL TERRENO CUADRADO");
            System.out.println("============================");
            System.out.print("\nPor Favor ingrese en metros el lado del terreno: ");
            Cuadrado.setLado(sc.nextInt());
            System.out.print("Ingrese el precio del metro cuadrado: ");
            Cuadrado.setCosto_terr(sc.nextFloat());  
            float cua_f =((Cuadrado.getLado()*Cuadrado.getLado())*Cuadrado.getCosto_terr());
            System.out.print("El precio total del terreno cuadrado es de: "+cua_f+"\n");
        }else if(op == 2){
            Calculo_terreno Rectangular = new Calculo_terreno();
            System.out.println("\nCALCULO DEL TERRENO RECTANGULAR");
            System.out.println("===============================");
            System.out.print("\nPor Favor ingrese en metros el altura del terreno: ");
            Rectangular.setAltura(sc.nextInt());
            System.out.print("Por Favor ingrese en metros la base del terreno: ");
            Rectangular.setBase(sc.nextInt());
            System.out.print("Ingrese el precio del metro cuadrado: ");
            Rectangular.setCosto_terr(sc.nextFloat());  
            float cua_f =((Rectangular.getAltura()*Rectangular.getBase())*Rectangular.getCosto_terr());
            System.out.println("El precio total del terreno rectangular es de: "+cua_f+"\n");
        }else{
            System.err.println("La opcion escogida es invalida");
        }
               
    }
}
