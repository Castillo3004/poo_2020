package clase6_deber;
import java.util.Scanner;

public class Ejecuta_estadoCuenta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cuenta_ha,cadena1="",cadena2=""; 
        double saldo_ini,dep,ret,total_d=0,total_r=0;
        int opc,opc2,i=0; 
        System.out.println("PROGRAMA QUE CALCULA EL ESTADO DE CUENTA");
        System.out.println("========================================");
        System.out.print("\nIngrese el nombre de la cuentahabiente: ");
        cuenta_ha = sc.next();
        System.out.print("\nIngrese el Saldo inicial de la cuenta: ");
        saldo_ini = sc.nextDouble();
        EstadoCuenta objCuenta = new EstadoCuenta(cuenta_ha,saldo_ini);
        do{
            System.out.println("Digite el numero del proceso que desea realizar segun se muestra a continuación: \n1.- Deposito 2.- Retiro ");
            opc2 = sc.nextInt();
            if(opc2 == 1 ){
                System.out.println("Ingrese la cantidad de dinero que desea depositar: ");
                dep = sc.nextDouble();
                objCuenta.setDeposito(dep);
                objCuenta.CalculaDeposito();
                cadena1 += ((i+1)+"                "+dep+"             "+objCuenta.getDeposito());
                total_d += objCuenta.getDeposito();
            }else if(opc2 == 2){
                System.out.println("Ingrese la cantidad de dinero que desea retirar: ");
                ret = sc.nextDouble();
                objCuenta.setRetiro(ret);
                objCuenta.CalculaRetiro();
                cadena2 += ((i+1)+"                                       "+ret+"             "+objCuenta.getRetiro());
                total_r += objCuenta.getRetiro(); 
            }
            System.out.println("Si desea realizar otro retiro o deposito digite 0");
            opc = sc.nextInt();
        }while(opc == 0);
        System.out.println("ESTADO DE CUENTA");
        System.out.print("\nCUENTAHABIENTE: "+cuenta_ha);
        System.out.println("\nSALDO INICIAL: "+saldo_ini);
        System.out.println("\nMOVIMIENTO           DEPOSITO          RETIRO            SALDO");
        System.out.println(cadena1);
        System.out.println(cadena2);
        System.out.println("TOTALES               "+total_d+"          "+total_r+"      "+(objCuenta.getDeposito()+objCuenta.getRetiro()));
    }
}
