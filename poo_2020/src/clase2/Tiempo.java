/*
 *Clase Tiempo, para poder obtener la hora
 */
package clase2;
public class Tiempo {
    //Variables, atributos, caracteristicas o propiedades de la clase Tiempo 
    private int hora;
    private int minuto;
    private int segundo; 
    
    //Vamos a encapsular los atributos con ayuda de los metodos. 
    /**
     * Este método devuelve el valor contenido en la variable hora
     * @return hora
     */
    public int obtener_hora(){
        
        return hora; 
    }
    /**
     * Este método devuelve el valor contenido en la variable minuto 
     * @return hora
     */
    public int obtener_minuto(){
        
        return minuto;
    }
    /**
     * Este método devuelve el valor contenido en la variable segundo 
     * @return hora
     */
    public int obtener_segundo(){
        
        return segundo ;
    }
    /**
     * Metodo para establecer el valor de la variable hora 
     * @param valor_hora 
     */
    public void establecer_hora(int valor_hora){
        hora = valor_hora; 
    }
    /**
     * Metodo para establecer el valor de la variable hora 
     * @param valor_minuto  
     */
    public void establecer_minuto(int valor_minuto){
        minuto = valor_minuto; 
    }
    /**
     * Metodo para establecer el valor de la variable hora 
     * @param valor_segundo 
     */
    public void establecer_segundo(int valor_segundo){
        segundo = valor_segundo; 
    }
    
    /**
     * Método para obtener la hora actual completa en formato hh:mm:ss
     */
    public void obtener_hora_actual(){
        String hora_completa = hora + ":"+minuto+":"+segundo;
        System.out.println("Hora Actual: "+hora_completa);
    }
        
}
