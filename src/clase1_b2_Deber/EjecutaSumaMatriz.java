
package clase1_b2_Deber;

import java.util.Scanner;

public class EjecutaSumaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas,i,j;
        System.out.println("SUMA Y PROMEDIO DE MATRIZ");
        System.out.println("=========================");
        System.out.print("\n\nIngrese el numero de filas de la matriz: ");
        filas = sc.nextInt();
        System.out.print("Ingrese el numero de columnas de la matriz: ");
        columnas = sc.nextInt();
        int matriz[][] = new int[filas][columnas];
        System.out.println("\nRellene la matriz: ");
        for(i=0; i<matriz.length;i++){
            for(j = 0; j<matriz[0].length;j++){
                System.out.print("Elemento ["+(i+1)+"]["+(j+1)+"]:");
                matriz[i][j]= sc.nextInt();
            }
        }
        SumaMatriz objMatriz = new SumaMatriz(filas,columnas,matriz);
        objMatriz.Suma();
        objMatriz.promedio();
        
        System.out.println("\nLa Matriz que usted ingreso es la siguiente: ");
        System.out.println();
        for(i = 0; i < matriz.length; i++){
            for(j = 0; j<matriz[0].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.print("\n\nLa suma total de todos los elementos es: "+objMatriz.getSuma());
        System.out.println("\nEl promedio de la matriz es: "+objMatriz.getPromedio());
    }
}
