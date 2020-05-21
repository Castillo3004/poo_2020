/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5_deber;

import java.util.Scanner;

/**
 *
 * @author Luz Ma
 */
public class EjecutaTerreno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Terreno objTerreno = new Terreno ();
        System.out.println("Calculo del Precio de un Terreno");
        System.out.print("\nPor Favor ingrese el largo del Terreno: ");
        objTerreno.setLargo(sc.nextDouble());
        System.out.print("Por Favor ingrese el ancho del Terreno: ");
        objTerreno.setAncho(sc.nextDouble());
        System.out.print("Por Favor ingrese el  precio por metro cuadrado: ");
        objTerreno.setPrecio_m(sc.nextDouble());

        objTerreno.calcularPrecioTerr();
        System.out.println("\nEl costo total  del Terreno es: "+objTerreno.getPrecio_terr());
        
    }
    
}
