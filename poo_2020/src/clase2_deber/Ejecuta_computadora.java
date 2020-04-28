/*
 * Clase que permite realizar la creación de objetos a partir de la clase Computadora.
 */
package clase2_deber;

public class Ejecuta_computadora {
    public static void main(String[] args) {
        //Creamos un objeto de tipo Commputadora -> Instanciación
        Computadora computadora= new Computadora();
        //Establecer el valor en las propiedades en la clase Computadora
        computadora.establecer_marca_placa("Asus ROG Strix X570-I Gaming");
        computadora.establecer_sistema_operativo("Windows 10 Pro ");
        computadora.establecer_marca_tarjeta_grafica("Asus GeForce GT 1030 2GH LP OC");
        computadora.establecer_tamaño_disco_duro("2 Terabytes");
        computadora.establecer_marca_cpu("Intel® Core™ i9-10980HK");
        
 
 
        //obtener los datos completos de la computadora
        computadora.obtener_datos_computadora();
        
        //creacion de un nuevo objeto de la clase Computadora
        Computadora computadora2 = new Computadora();
    }
}