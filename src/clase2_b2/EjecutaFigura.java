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
public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite 1, para calcular el área del triangulo ");
        System.out.println("Digite 2, para calcular el área del rectangulo ");
        System.out.println("Digite 3, para calcular el área del cuadrado ");
        System.out.println("Digite 4, para calcular el área del circulo ");
        int opcion = sc.nextInt();
        String nombre_figura = "";
        sc.nextLine();
        switch(opcion){
            case 1: 
                nombre_figura = "TRIANGULO";
                System.out.println("\nIngrese el valor de la base: ");
                double base = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura: ");
                double altura = sc.nextDouble();
                Triangulo tria = new Triangulo(base, altura,nombre_figura);
                tria.calcular_area_triangulo();
                System.out.println("\nEl área para la figura "+tria.getNombre()+" es: "+tria.getArea());
                break;
            case 2: 
                nombre_figura = "RECTANGULO";
                System.out.println("\nIngrese el valor de la base: ");
                double base2 = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura: ");
                double altura2 = sc.nextDouble();
                Rectangulo rect = new Rectangulo(base2, altura2,nombre_figura);
                rect.calcular_area_rectangulo();
                System.out.println("\nEl área para la figura "+rect.getNombre()+" es: "+rect.getArea());
                break; 
            case 3: 
                nombre_figura = "CUADRADO";
                System.out.println("\nIngrese el valor de el lado del cuadrado: ");
                double lado = sc.nextDouble();
                Cuadrado cuadra = new Cuadrado(lado,nombre_figura);
                cuadra.calcular_area_cuadrado();
                System.out.println("\nEl área para la figura "+cuadra.getNombre()+" es: "+cuadra.getArea());
                break;
            case 4: 
                nombre_figura = "CIRCULO";
                System.out.println("\nIngrese el valor de el radio: ");
                double radio = sc.nextDouble();
                Circulo circ = new Circulo(radio ,nombre_figura);
                circ.calcular_area_circulo();
                System.out.println("\nEl área para la figura "+circ.getNombre()+" es: "+circ.getArea());
                break;
        }
    }
}
