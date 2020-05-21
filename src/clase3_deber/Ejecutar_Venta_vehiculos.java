package clase3_deber;
import java.util.Scanner;

public class Ejecutar_Venta_vehiculos{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Venta_vehiculos ventaV1 = new Venta_vehiculos();
        System.out.println("VENTA VEHICULO N°1\n===================");
        System.out.print("Ingrese la marca del vehiculo: "); 
        ventaV1.set_marca(sc.nextLine());
        System.out.print("Ingrese el año de fabricacion: ");
        ventaV1.set_año_fabricacion(sc.nextInt()); 
        System.out.print("Ingrese el precio del vehiculo: ");
        ventaV1.set_precio_vehiculo(sc.nextFloat()); 
        System.out.print("Ingrese el kilometraje recorrido: ");
        ventaV1.set_kilometraje(sc.nextFloat());
        System.out.print("Ingrese la placa: ");
        ventaV1.set_placa(sc.next());
       
        Venta_vehiculos ventaV2 = new Venta_vehiculos();
        System.out.println("\nVENTA VEHICULO N°2\n===================");
        System.out.print("Ingrese la marca del vehiculo: "); 
        ventaV2.set_marca(sc.next());
        System.out.print("Ingrese el año de fabricacion: ");
        ventaV2.set_año_fabricacion(sc.nextInt()); 
        System.out.print("Ingrese el precio del vehiculo: ");
        ventaV2.set_precio_vehiculo(sc.nextFloat()); 
        System.out.print("Ingrese el kilometraje recorrido: ");
        ventaV2.set_kilometraje(sc.nextFloat());
        System.out.print("Ingrese la placa: ");
        ventaV2.set_placa(sc.next()); 
        
        System.out.println("\nFICHA DE CUENTA BANCARIA N°1\n===========================");  
        System.out.println("Marca: "+ventaV1.get_marca()+"\nAño de Fabricación: "+ventaV1.get_año_fabricacion()+"\nPrecio: $"+ventaV1.get_precio_vehiculo()+"\nKilometraje recorrido: "+ventaV1.get_kilometraje()+" Km\nPlaca: "+ventaV1.get_placa());
        System.out.println("\nFICHA DE CUENTA BANCARIA N°2\n===========================");
        System.out.println("Marca: "+ventaV2.get_marca()+"\nAño de Fabricación: "+ventaV2.get_año_fabricacion()+"\nPrecio: $"+ventaV2.get_precio_vehiculo()+"\nKilometraje recorrido: "+ventaV2.get_kilometraje()+" Km\nPlaca: "+ventaV2.get_placa());
    }
}
