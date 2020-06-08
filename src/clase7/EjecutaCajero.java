package clase7;

import java.util.Scanner;

public class EjecutaCajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo,deposito,retiro;
        System.out.println("CAJERO AUTOMATICO POO ");
        System.out.println("Ingrese el saldo Inicial de su cuenta");
        saldo = sc.nextDouble();
        Cajero obj = new Cajero(saldo);
        String desea = "SI";
        do{
            System.out.println("Por Favor digite el numero del proceso  que desea realizar segun se muestra a continuación: \n1.- Retiro\n3.- Consultar Saldo\n4.- Finalizar \n:");
            int op = sc.nextInt();
            switch(op){
                case 1: 
                    System.out.print("\nPor Favor ingrese el valor a depositar: ");
                    deposito = sc.nextDouble(); 
                    obj.depositar(deposito);
                    break;
                case 2:
                    System.out.print("\nPor Favor ingrese el valor a retirar: ");
                    retiro = sc.nextDouble();
                    obj.retirar(retiro);
                    break;
                case 3:
                    System.out.println("El saldo de su cuenta es: "+ obj.consultar_saldo());
                    break;
                case 4: 
                    System.out.println("GRACIAS POR USAR EL PROGRAMA");
                    desea = "NO";
                    break;
            }       
        }while(desea.toLowerCase().equals("SI"));
    }
}
