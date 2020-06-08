
package clase6_deber;

import java.util.Scanner;

public class Ejecuta_SumaPAres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,aux; 
        SumaPares objSumPar = new SumaPares();
        System.out.println("PROGRAMA QUE CALCULA LA SUMA DE NUMEROS PARES");
        System.out.println("=============================================");
        System.out.print("\nDigite la cantidad de numeros pares que desea ingresar: ");
        aux = sc.nextInt();
        for(int i = 0; i < aux; i++){
            System.out.println("Por favor ingrese el "+(i+1)+"° numero: ");
            num = sc.nextInt();
            if(num < 2){
                System.err.println("ERROR, EL NUMERO DEBE SER MAYOR A 2");   
                i = aux; 
            }else{
                objSumPar.setNumeros(num);
                objSumPar.CalculaPar(); 
            }
        }
        System.out.println("\nLa suma total de los numeros pares ingresados es: "+objSumPar.ObtenerPar());
        
    }
    
}
