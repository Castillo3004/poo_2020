package clase7_deber;

import java.util.Scanner;

public class EjecutaMultiplicaEnteros {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1, num2;
        MultiplicaEnteros objNumeros = new MultiplicaEnteros();    
        System.out.println("PROGRAMA QUE MULTIPLICA NUMEROS ENTEROS");
        System.out.println("=======================================");
        System.out.print("\nPor Favor Digite el primer numero que desea multiplicar: ");
        num1= sc.nextInt();
        System.out.print("\nPor Favor Digite el segundo numero que desea multiplicar:");
        num2 = sc.nextInt();
        objNumeros.setNumero1(num1);
        objNumeros.setNumero2(num2);
        objNumeros.CalculaMultiplicacion();
        System.out.println("\n\nEl resultado de la multiplicación de los valores ingresados "+num1+" y "+num2+" es: "+objNumeros.getTotal());  
    }
}
