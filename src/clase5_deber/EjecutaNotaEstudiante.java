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
public class EjecutaNotaEstudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NotaEstudiante objCalificacion = new NotaEstudiante();
        System.out.println("Calculo de la calificacion de un estudiante\n");
        System.out.println("Por Faavor ingrese el nombre del estudiante: ");
        objCalificacion.setNombre(sc.next());
        System.out.println("Por Favor ingrese la primera calificacion de "+objCalificacion.getNombre());
        objCalificacion.setSeg_calif(sc.nextDouble());
        System.out.println("Por Favor ingrese la segunda calificacion de "+objCalificacion.getNombre());
        objCalificacion.setTer_calif(sc.nextDouble());
        System.out.println("Por Favor ingrese la tercera calificacion de "+objCalificacion.getNombre());
        objCalificacion.setPri_calif(sc.nextDouble());
        objCalificacion.CalcularPrc();
        objCalificacion.CalcularSgc();
        objCalificacion.CalcularTcc();
        objCalificacion.calcularCalificacionFinal();
        System.out.println("\nNOTA FINAL \n\nEstudiante: "+objCalificacion.getNombre()+"\n"+objCalificacion.getCalif_final());
    }
    
    
    
}
