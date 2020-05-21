/*
 * Clase que permite realizar la creación de objetos a partir de la clase Universidad.
 */
package clase2_deber;

public class Ejecuta_virus_informatico {
    public static void main(String[] args) {
        //Creamos un objeto de tipo Universidad -> Instanciación
        Virus_Informatico virus= new Virus_Informatico();
        //Establecer el valor en las propiedades en la clase Universidad
        virus.establecer_tipo_de_virus("Storm Worm");
        virus.establecer_nivel_de_poliformismo("Alto");
        virus.establecer_nivel_de_mutabilidad("Bajo");
        virus.establecer_nivel_de_resistencia("Alto");
        virus.establecer_nivel_de_diseminacion("Medio");
        
 
 
        //obtener los datos completos del universidad
        virus.obtener_datos_virus();
        
        //creacion de un nuevo objeto de la clase universidad
        Virus_Informatico virus2 = new Virus_Informatico();
    }
}