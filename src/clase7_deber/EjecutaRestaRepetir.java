package clase7_deber;

import java.util.Scanner;

public class EjecutaRestaRepetir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        RestaRepetir objDivResta = new  RestaRepetir();
        System.out.println("PROGRAMA QUE REALIZA UNA DIVISION ENTERA");
        System.out.println("========================================");
        System.out.print("\nPor Favor ingrese el primer numero(dividendo) con el cual desea realizar la division: ");
        num1 = sc.nextInt();
        System.out.print("\nPor Favor ingrese el segundo numero(divisor) con el cual desea realizar la division: ");
        num2 = sc.nextInt(); 
        objDivResta.setNumero1(num1);
        objDivResta.setNumero2(num2);
        objDivResta.CalculaDivision();
        System.out.println("\n\nEl resultado de la division de los valores ingresados "+num1+" y " +num2+" es : "+objDivResta.getTotal());
  
    }
}
