/*
 * Clase que permite realizar la creación de objetos a partir de la clase Tiempo. 
 */
package clase2;

public class EjecutaTiempo {
    public static void main(String[] args) {
        //Creamo un objeto de tipo Tiempo -> Instanciación
        Tiempo tiempo = new Tiempo();
        //Establecer el valor en las propiedades en la clase Tiempo
        tiempo.establecer_hora(10);
        tiempo.establecer_minuto(11);
        tiempo.establecer_segundo(30);
        
        //vamos a obtener el valor de la variable hora
        int hr = tiempo.obtener_hora();
        System.out.println("Hora Establecida: "+hr);
        
        //obtener la hora completa 
        tiempo.obtener_hora_actual();
        
        //creacion de un nuevo objeto de la clase Tiempo
        Tiempo tiempo2 = new Tiempo();
    }
}
