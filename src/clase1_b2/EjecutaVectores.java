
package clase1_b2;

import java.util.Scanner;


public class EjecutaVectores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vectA[]=new int [5];
        int vectB[]=new int [5];
        System.out.println("MULTIPLICA VECTORES");
        System.out.println("===================");
        System.out.print("\nIngreso de datos para el vector A: ");
        System.out.println();
        for(int i = 0;i<vectA.length; i++){
            System.out.print("Elemento ["+(i+1)+"]: ");
            vectA[i]= sc.nextInt();
        }
        System.out.print("\nIngreso de datos para el vector B: ");
        System.out.println();
        for(int i = 0;i<vectB.length; i++){
            System.out.print("Elemento ["+(i+1)+"]: ");
            vectB[i]= sc.nextInt();
        }
        Vectores objVector = new Vectores();
        objVector.setVectorA(vectA);
        objVector.setVectorB(vectB);
        
        objVector.CalcularProducto();
        System.out.println();
        for(int i = 0; i <vectA.length;i++){
            System.out.println("Vector A["+vectA[i]+"] x Vector B ["+vectB[i]+"] = "+(vectA[i]*vectB[i]));
        }
        
        System.out.println("\nLa suma total de la multiplicacion de todos los productos es: "+objVector.getProducto());
    }
}
