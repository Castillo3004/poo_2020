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
public class EjecutaPedido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Pedido objPedido = new Pedido();
        System.out.println("Calculo del precio de un Pedido");
        System.out.println("\nPor Favor ingrese el Nombre del Articulo: ");
        objPedido.setDescripcion(sc.next());
        System.out.println("Por Favor ingrese la cantidad a pedir: ");
        objPedido.setCantidad(sc.nextInt());
        System.out.println("Por Favor ingrese el precio del Articulo por unidad: ");
        objPedido.setPrecio_unitario(sc.nextDouble());
        
        objPedido.calcularPrecioTotal();
        
        System.out.println("\nEl precio total de su pedido es de: $"+objPedido.getPrecio_total());
        
    }
}
