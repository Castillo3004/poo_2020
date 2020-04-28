/*
 * Clase que permite realizar la creación de objetos a partir de la clase Animal.
 */
package clase2_deber;

public class Ejecuta_animal {
    public static void main(String[] args) {
        //Creamos un objeto de tipo Animal -> Instanciación
        Animal animal= new Animal();
        //Establecer el valor en las propiedades en la clase Animal
        animal.establecer_tipo_de_alimentacion("Carnivoro");
        animal.establecer_edad(10);
        animal.establecer_habitad("Sabana y Pastizales");
        animal.establecer_tipo_de_reproduccion("Vivipara");
        animal.establecer_cantidad_extremidades(4);
        
 
 
        //obtener los datos completos del animal
        animal.obtener_datos_animal();
        
        //creacion de un nuevo objeto de la clase animal
        Animal animal2 = new Animal();
    }
}