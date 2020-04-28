/*
 *Clase Universidad, para poder obtener los datos de un Universidad cualquiera
 */
package clase2_deber;
public class Virus_Informatico {
    //Variables, atributos, caracteristicas o propiedades de la clase Universidad
    private String tipo_de_virus;
    private String nivel_de_poliformismo;
    private String nivel_de_mutabilidad;
    private String nivel_de_resistencia;
    private String nivel_de_diseminacion;
    
    //Vamos a encapsular los atributos con ayuda de los metodos. 
    /**
     * Este metodo devuelve el valor contenido en la variable tipo_de_virus
     * @return tipo_de_virus
     */
    public String obtener_tipo_de_virus(){
        
        return tipo_de_virus; 
    }
    /**
     * Este método devuelve el valor contenido en la variable nivel_de_poliformismo
     * @return nivel_de_poliformismo
     */
    public String obtener_nivel_de_poliformismo(){
        
        return nivel_de_poliformismo;
    }
    /**
     * Este método devuelve el valor contenido en la variable nivel_de_mutabilidad
     * @return nivel_de_mutabilidad
     */
    public String obtener_nivel_de_mutabilidad(){
        
        return nivel_de_mutabilidad;
    }
    /**
     * Este método devuelve el valor contenido en la variable nivel_de_resistencia
     * @return nivel_de_resistencia
     */
    public String obtener_nivel_de_resistencia(){
        
        return nivel_de_resistencia;
    }
    /**
     * Este método devuelve el valor contenido en la variable nivel_de_diseminacion
     * @return nivel_de_diseminacion
     */
    public String obtener_nivel_de_diseminacion(){
        
        return nivel_de_diseminacion;
    }
    /**
     * Metodo para establecer el valor de la variable tipo_de_virus
     * @param clase_de_virus
     */
    public void establecer_tipo_de_virus(String clase_de_virus){
        tipo_de_virus = clase_de_virus; 
    }
    /**
     * Metodo para establecer el valor de la variable nivel_de_poliformismo
     * @param tipo_de_poliformismo
     */
    public void establecer_nivel_de_poliformismo(String tipo_de_poliformismo){
        nivel_de_poliformismo= tipo_de_poliformismo;
    }
    /**
     * Metodo para establecer el valor de la variable nivel_de_mutabilidad
     * @param tipo_de_mutabilidad
     */
    public void establecer_nivel_de_mutabilidad(String tipo_de_mutabilidad){
        nivel_de_mutabilidad = tipo_de_mutabilidad; 
    }
    /**
     * Método para establecer el valor de la variable nivel_de_resistencia
     * @param tipo_de_resistencia
     */
    public void establecer_nivel_de_resistencia(String tipo_de_resistencia){
        nivel_de_resistencia= tipo_de_resistencia;
    }
    /**
     * Método para establecer el valor de la variable nivel_de_diseminacion
     * @param tipo_de_diseminacion
     */
    public void establecer_nivel_de_diseminacion(String  tipo_de_diseminacion){
        nivel_de_diseminacion=  tipo_de_diseminacion;
    }
    /**
     * Método para obtener los datos de un Virus
     */
    public void obtener_datos_virus(){
        String datos_virus="Tipo de Virus: "+tipo_de_virus+"\nNivel de Poliformismo "+nivel_de_poliformismo+"\nNivel de Mutabilidad: "+ nivel_de_mutabilidad+ "\nNivel de Resistencia: "+nivel_de_resistencia+"\nNivel de Diseminacion: "+nivel_de_diseminacion;
        System.out.println("**CARACTERISTICAS VIRUS** \n"+datos_virus);
    }
        
}