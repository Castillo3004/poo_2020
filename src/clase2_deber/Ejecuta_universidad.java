/*
 * Clase que permite realizar la creación de objetos a partir de la clase Universidad.
 */
package clase2_deber;

public class Ejecuta_universidad {
    public static void main(String[] args) {
        //Creamos un objeto de tipo Universidad -> Instanciación
        Universidad universidad= new Universidad();
        //Establecer el valor en las propiedades en la clase Universidad
        universidad.establecer_sectorizacion("Privada");
        universidad.establecer_direccion("San Cayetano Alto, Calle París, Loja");
        universidad.establecer_rector("Santiago Acosta Aide");
        universidad.establecer_precio_matricula(1414);
        universidad.establecer_categoria("B");
        
 
 
        //obtener los datos completos del universidad
        universidad.obtener_datos_universidad();
        
        //creacion de un nuevo objeto de la clase universidad
        Universidad universidad2 = new Universidad();
    }
}