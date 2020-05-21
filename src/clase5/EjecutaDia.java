/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.util.Scanner;

/**
 *
 * @author Luz Ma
 */
public class EjecutaDia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Dia dia = new Dia();
        System.out.println("PROGRAMA PARA DETERMINAR EL DIA SEGUN EL NUMERO INGRESADO ");
        System.out.println("Ingrese el número de dia: ");
        dia.setNumDia(sc.nextInt());
        
        dia.calcularNombreDia();
        
        System.out.println("El dia correspondiente de acuerdo al número ingresado es: "+dia.getNombreDia());
    }
}
