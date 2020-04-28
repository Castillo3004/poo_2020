/*
 * Clase que permite realizar la creación de objetos a partir de la clase Celular.
 */
package clase2_deber;

public class Ejecuta_celular {
    public static void main(String[] args) {
        //Creamos un objeto de tipo Celular -> Instanciación
        Celular celular= new Celular();
        //Establecer el valor en las propiedades en la clase Celular
        celular.establecer_marca("Samsung Galaxy J7 Pro");
        celular.establecer_sistema_operativo("Android 7.0");
        celular.establecer_procesador("Exynos 7870 1.6GHz");
        celular.establecer_tamaño_pantalla((float) 5.5);
        celular.establecer_tamaño_ram(3);
        
 
 
        //obtener los datos completos del celular
        celular.obtener_datos_celular();
        
        //creacion de un nuevo objeto de la clase celular
        Celular celular2 = new Celular();
    }
}