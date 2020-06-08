
package clase6_deber;

import java.util.Scanner;

public class Ejecuta_precios_venta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String descrip,cadena=""; 
        double costo_pro,t_costo_p=0,t_utilidad=0,t_impuesto=0, t_precio_v=0;
        int op = 0; 
        System.out.println("PROGRAMA QUE CALCULA LOS PRECIOS DE VENTA");
        System.out.println("=========================================");
        
        do{    
            System.out.print("\nPor favor ingrese la descripcion del producto: ");
            descrip = sc.next(); 
            System.out.print("\nPor favor ingrese el costo de produccion de "+(descrip)+":");
            costo_pro = sc.nextDouble();
            Precios_venta objVenta = new Precios_venta(descrip,costo_pro);
            objVenta.calculoImpuesto();
            objVenta.calculoUtilidad();
            objVenta.calucloPrecioVenta();
            t_costo_p += objVenta.getCosto_p();
            t_utilidad += objVenta.getUtilidad();
            t_impuesto += objVenta.getImpuesto();
            t_precio_v += objVenta.getPrecio_v(); 
            cadena += (descrip+"                       "+costo_pro+"                      "+objVenta.getUtilidad()+"                  "+objVenta.getImpuesto()+"              "+objVenta.getPrecio_v()+"\n");
            System.out.print("Si desea ingresar otro producto digite 0, en caso contrario digite cualquier numero: ");
            op = sc.nextInt();
        }while(op == 0); 
        System.out.println("\n                                    PRECIOS DE VENTA         ");
        System.out.println("ARTICULO             COSTO DE PRODUCCION            UTILIDAD                IMPUESTO             PRECIO DE VENTA ");
        System.out.println("__________________________________________________________________________________________________________________");
        System.out.println(cadena);
        System.out.println("TOTAL                      "+t_costo_p+"                      "+t_utilidad+"                  "+t_impuesto+"              "+t_precio_v);
    }
    
}
