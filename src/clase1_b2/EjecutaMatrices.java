
package clase1_b2;

import java.util.Scanner;

public class EjecutaMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int matA [][] = new int [3][3];
        int matB [][] = new int [3][3];
        System.out.println("SUMA DE MATRICES");
        System.out.println("================");
        System.out.println("\nMatriz A: ");
        System.out.println("Rellene la matriz: ");
        for( int i = 0; i< matA.length; i++){
            for ( int j = 0; j <matA[0].length; j++){
                System.out.print("Elemento ["+(i+1)+"]["+(j+1)+"]: ");
                matA[i][j]= sc.nextInt();
            }
        }
        System.out.println("\nMatriz B: ");
        System.out.println("Rellene la matriz: ");
        for( int i = 0; i< matB.length; i++){
            for ( int j = 0; j <matB[0].length; j++){
                System.out.print("Elemento ["+(i+1)+"]["+(j+1)+"]: ");
                matB[i][j]= sc.nextInt();
            }
        }
        Matrices objMatriz = new Matrices();
        objMatriz.setMatrizA(matA);
        objMatriz.setMatrizB(matB);
        
        objMatriz.Sumar();
        
        int matC[][] = objMatriz.getMatrizC();
        System.out.println();
        for(int i = 0; i < matC.length; i++){
            for(int j = 0; j<matC[0].length;j++){
                System.out.print(matC[i][j]+"\t");
            }
            System.out.println();
        }
    
    }
}
