
package clase1_b2_Deber;

import java.util.Scanner;

public class EjecutaMatrizTranspuesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        System.out.println("MATRIZ TRANSPUESTA");
        System.out.println("==================");
        System.out.print("\n\nIngrese el numero de filas de la matriz: ");
        filas = sc.nextInt();
        System.out.print("Ingrese el numero de columnas de la matriz: ");
        columnas = sc.nextInt();
        int matriz[][] = new int[filas][columnas];
        
        System.out.println("\nRellene la matriz: ");
        for(int i=0; i<matriz.length;i++){
            for(int j = 0; j<matriz[0].length;j++){
                System.out.print("Elemento ["+(i+1)+"]["+(j+1)+"]:");
                matriz[i][j]= sc.nextInt();
            }
        }
        MatrizTranspuesta objMatTrans = new MatrizTranspuesta(filas,columnas);
        objMatTrans.Transpuesta();
        
        
        System.out.println("\nLa Matriz que usted ingreso es la siguiente: ");
        System.out.println();
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j<matriz[0].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
        int matrizB[][]= objMatTrans.getMatB();
        System.out.println("\nLa Matriz transpuesta es: ");
        System.out.println();
        for(int i = 0; i < matrizB.length; i++){
            for(int j = 0; j<matrizB[0].length;j++){
                System.out.print(matrizB[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
