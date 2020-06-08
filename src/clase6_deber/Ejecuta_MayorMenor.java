package clase6_deber;

import java.util.Scanner;

public class Ejecuta_MayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux,i=0;
        double may = 0, men=0;
        
        System.out.println("PROGRAMA QUE DA A CONOCER EL NUMERO MAYOR Y MENOR DE UNA SERIE DE NUMEROS");
        System.out.println("=========================================================================");
        System.out.print("\nPor favor digite cuantos umros va a ingresar: ");
        aux = sc.nextInt();
        MayorMenor objMayMen = new MayorMenor();
        for(i=0; i<aux; i++){         
            System.out.print("\nPor favor ingrese el "+(i+1)+"° numero: ");
            objMayMen.setNumeros(sc.nextInt());
            objMayMen.CalculaMayorMenor();
            may = objMayMen.getMayor();
            men = objMayMen.getMenor();
        }
        System.out.println("\n\nDe acuerdo a los valores ingresados: \nEl número mayor es: "+may+"\nEl numero menor es: "+men);
    }
}