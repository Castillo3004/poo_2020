package clase5_deber;

import java.util.Scanner;

public class EjecutaAngulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Angulo objAngulo = new Angulo();
        System.out.println("Definir Tipo de Triangulo\n");
        System.out.print("Ingrese el tamaño del Angulo A: ");
        objAngulo.setAngulo_A(sc.nextDouble());
        System.out.print("Ingrese el tamaño del Angulo B: ");
        objAngulo.setAngulo_B(sc.nextDouble());
        System.out.print("Ingrese el tamaño del Angulo C: ");
        objAngulo.setAngulo_C(sc.nextDouble());
        objAngulo.definirTipoTriangulo();
        System.out.println("\nEl tipo de triangulo resutlante confome a los tamaños de Angulos ingresados es: \n"+objAngulo.getTipo_triangulo());
        
    }
}
