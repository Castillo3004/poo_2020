/*
 * Clase que permite realizar la creación de objetos a partir de la clase Estudiante.
 */
package clase2_deber;

public class Ejecuta_estudiante {
    public static void main(String[] args) {
        //Creamos un objeto de tipo Estudiante -> Instanciación
        Estudiante alumno = new Estudiante();
        //Establecer el valor en las propiedades en la clase Estudiante
        alumno.establecer_etnia("Mestizo");
        alumno.establecer_carrera("Medicina");
        alumno.establecer_modalidad("Presencial");
        alumno.establecer_numero_carnet(9212);
        alumno.establecer_numero_cedula("1108361216");
        
 
 
        //obtener los datos completos del estudiante
        alumno.obtener_datos_estudiante();
        
        //creacion de un nuevo objeto de la clase Estudiante
        Estudiante estudiante2 = new Estudiante();
    }
}
