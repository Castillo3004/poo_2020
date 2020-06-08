
package clase6_deber;

import java.util.Scanner;

public class EjecutaVendedor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux = 1,aux1=1;
        String may_vend = "",men_vend="";
        double ventaMax = 0,v_auto,t_venta=0;
        double ventaMin = 0;
        System.out.println("PROGRAMA SOBRE AUTORS DE VENTA");
        System.out.println("==============================");
        Vendedor objCompañia = new Vendedor();
        while (aux == 1) {
            System.out.println("Ingrese el nombre del vendedor");
            objCompañia.setNombre(sc.next());
            while (aux1 == 1) {
                System.out.println("Ingrese el valor del auto vendido");
                v_auto = sc.nextDouble();
                t_venta += v_auto;
                System.out.println("Desea Ingresar otro auto vendido para el mismo vendedor? s/n");
                aux1 = sc.nextInt();
                ventaMax += t_venta;
            }          
            if (t_venta > ventaMax) {
                may_vend = objCompañia.getNombre();
            }
            if(t_venta < ventaMin){
                men_vend = objCompañia.getNombre();
            }
            System.out.println("Desea Ingresar un nuevo vendedor? s/n");
            aux = sc.nextInt();           
        }
        System.out.println("Vendedor Mayor: " + may_vend);
        System.out.println("Vendedor Menor: " + men_vend);
    }
}
