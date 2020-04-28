/*
 * Clase que permite realizar la creación de objetos a partir de la clase Docente.
 */
package clase2_deber;

public class Ejecuta_docente {
    public static void main(String[] args) {
        //Creamos un objeto de tipo Docente -> Instanciación
        Docente docente = new Docente();
        //Establecer el valor en las propiedades en la clase Docente
        docente.establecer_area_academica("Humanistica");
        docente.establecer_nombre("Jorge Garcìa");
        docente.establecer_nacionalidad("Española");
        docente.establecer_nivel_de_enseñanza("Superior");
        docente.establecer_genero("Masculino");
        
 
 
        //obtener los datos completos del docente
        docente.obtener_datos_docente();
        
        //creacion de un nuevo objeto de la clase Docente
        Docente docente2 = new Docente();
    }
}