/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1_b2;

import java.util.ArrayList;
import java.util.List; 

public class Lista {
    public static void main(String[] args) {
        List<String>lista = new ArrayList<String>();
        System.out.println("Tamaño actual de la lista: "+lista.size());
        lista.add("Bryan");
        lista.add("Carlos");
        lista.add("Kevin");
        lista.add("Joselito");
        lista.add("Andres");
        System.out.println("Tamaño actual de la lista: "+lista.size());
        System.out.println(lista);
        System.out.println("Elmiminamos la posicion 2 ");
        lista.remove(2); 
        System.out.println("Tamaño actual de la lista: "+lista.size());
        System.out.println(lista);
        System.out.println("Valor en la posicion en: "+lista.get(2));
        
        System.out.println("MOSTRAR LOS ELEMENTOS DE NUESTRA LISTA");
        //for(int i =0; i<lista.size(); i++){
           // System.out.print(lista.get(i)+"\t");
        //}
        for(String nom: lista){
            System.out.println(nom+"\t");
        }
    }
    
}
