
package clase4_deber;

import java.util.Scanner;


public class Ejecutar_costo_produccion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        Costo_produccion Articulo= new Costo_produccion();
        System.out.println("REGISTRO DE DATOS PARA EL COSTO DE PRODUCCION DE UN ARTICULO");
        System.out.println("============================================================");
        System.out.print("Por favor ingrese el nombre del Articulo: ");
        Articulo.setDescripcion(sc.nextLine()); 
        System.out.print("Ingrese el numero de unidades que desea producir de "+Articulo.getDescripcion()+": ");
        Articulo.setUnidades_p(sc.nextInt()); 
        float costo_final = Articulo.getUnidades_p()*Articulo.getCosto_m();
        float cost_f2 = costo_final + 10700;
        System.out.println("\nFICHA DE COSTO TOTAL DE PRODUCCIÓN");
        System.out.println("====================================");  
        System.out.println("\nNombre del Articulo: "+Articulo.getDescripcion()+"\nNúmero de Articulos: "+Articulo.getUnidades_p()+"\nCosto Total: "+cost_f2);       
    }
}
