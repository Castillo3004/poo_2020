package clase3_deber;
import java.util.Scanner;

public class Ejecutar_cuenta_bancaria {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //creacion de objeto a partir de la clase Cuenta_bancaria 
        Cuenta_bancaria cuentaB1 = new Cuenta_bancaria();
        System.out.println("CUENTA BANCARIA N°1\n===================");
        System.out.print("Ingrese el número de cuenta: "); 
        cuentaB1.set_numero_de_cuenta(sc.nextLong());
        System.out.print("Ingrese el saldo de la cuenta: ");
        cuentaB1.set_valor_del_saldo(sc.nextFloat()); 
        System.out.print("Ingrese el nombre del socio: ");
        cuentaB1.set_nombre_del_socio(sc.next()); 
         
       
        Cuenta_bancaria cuentaB2 = new Cuenta_bancaria();
        System.out.println("\nCUENTA BANCARIA N°2\n===================");
        System.out.print("Ingrese el número de cuenta: "); 
        cuentaB2.set_numero_de_cuenta(sc.nextLong());
        System.out.print("Ingrese el saldo de la cuenta: ");
        cuentaB2.set_valor_del_saldo(sc.nextFloat()); 
        System.out.print("Ingrese el nombre del socio: ");
        cuentaB2.set_nombre_del_socio(sc.next()); 
        
        System.out.println("\nFICHA DE CUENTA BANCARIA N°1\n===========================");  
        System.out.println("\nNombre del Socio: "+cuentaB1.get_nombre_del_socio()+"\nNúmero de Cuenta: "+cuentaB1.get_numero_de_cuenta()+"\nSaldo de la Cuenta: "+cuentaB1.get_valor_del_saldo());
        System.out.println("\nFICHA DE CUENTA BANCARIA N°2\n===========================");
        System.out.println("\nNombre del Socio: "+cuentaB2.get_nombre_del_socio()+"\nNúmero de Cuenta: "+cuentaB2.get_numero_de_cuenta()+"\nSaldo de la Cuenta: "+cuentaB2.get_valor_del_saldo());
    }
}
