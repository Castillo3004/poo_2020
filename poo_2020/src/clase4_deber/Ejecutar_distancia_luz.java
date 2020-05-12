package clase4_deber;

import java.util.Scanner;

public class Ejecutar_distancia_luz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Distancia_luz Calculo= new Distancia_luz();
        System.out.println("REGISTRO DE DISTANCIA QUE RECORRE LA LUZ");
        System.out.println("========================================");
        System.out.print("Por favor ingrese el tiempo ne segundos: ");
        Calculo.setTiempo(sc.nextInt());
        int distancia = (int)(Calculo.getVelocidad()*Calculo.getTiempo());
        System.out.println("\n\nFICHA DE DISTANCIA");
        System.out.println("====================");  
        System.out.println("\nLa Distancia que recorre la Luz segun el tiempo ingresado es: "+distancia);       
    }
}
