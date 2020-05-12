package clase4_deber;

import java.util.Scanner;

public class Ejecutar_convertir_hora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Convertir_hora Conversion = new Convertir_hora();
        System.out.println("REGISTRO DE DISTANCIA QUE RECORRE LA LUZ");
        System.out.println("========================================");
        System.out.print("Por favor ingrese el tiempo en horas: ");
        Conversion.setHoras(sc.nextInt());  
        int dias = Conversion.getHoras() / 24; 
        int minutos = (Conversion.getHoras()-dias)*60;
        int segundos = (minutos-dias)*60;
        System.out.println("\n\nFICHA DE CONVERSION");
        System.out.println("=======================");  
        System.out.println("\nLas horas ingresadas son: "+Conversion.getHoras()+"\nConvertidas a Dias: "+dias+"\nMinutos: "+minutos+"\nSegundos: "+segundos);       
    }
    
}
