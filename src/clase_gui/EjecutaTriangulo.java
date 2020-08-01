
package clase_gui;

import java.util.Scanner;

public class EjecutaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAMA PARA CALCULAR EL AREA DE UN TRIANGULO");
        System.out.print("\nIngrese la base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la altura: ");
        double altura = sc. nextDouble(); 
        //creacion o instaciacion del objeto
        Triangulo objTria = new Triangulo(base, altura);
        objTria.CalcularArea();
        System.out.println("\nEl área del triangulo es: "+objTria.getArea());
        
    }
    
}
