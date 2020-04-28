/*
 *Clase Animal, para poder obtener los datos de un Animal cualquiera
 */
package clase2_deber;
public class Animal {
    //Variables, atributos, caracteristicas o propiedades de la clase Animal
    private String tipo_de_alimento;
    private int edad;
    private String habitad;
    private String tipo_de_reproduccion;
    private int cantidad_extremidades;
    
    //Vamos a encapsular los atributos con ayuda de los metodos. 
    /**
     * Este metodo devuelve el valor contenido en la variable tipo_de_alimento
     * @return tipo_de_alimento
     */
    public String obtener_tipo_de_alimento(){
        
        return tipo_de_alimento; 
    }
    /**
     * Este método devuelve el valor contenido en la variable edad
     * @return edad
     */
    public int obtener_edad(){
        
        return edad;
    }
    /**
     * Este método devuelve el valor contenido en la variable habitad
     * @return habitad
     */
    public String obtener_habitad(){
        
        return habitad;
    }
    /**
     * Este método devuelve el valor contenido en la variable tipo_de_reproduccion
     * @return tipo_de_reproduccion
     */
    public String obtener_tipo_de_reproduccion(){
        
        return tipo_de_reproduccion;
    }
    /**
     * Este método devuelve el valor contenido en la variable cantidad_extremidades
     * @return cantidad_extremidades
     */
    public int obtener_cantidad_extremidades(){
        
        return cantidad_extremidades;
    }
    /**
     * Metodo para establecer el valor de la variable tipo_de_alimento
     * @param tipo_alimentacion
     */
    public void establecer_tipo_de_alimentacion(String tipo_alimentacion){
        tipo_de_alimento = tipo_alimentacion; 
    }
    /**
     * Metodo para establecer el valor de la variable edad
     * @param valor_edad
     */
    public void establecer_edad(int valor_edad){
        edad = valor_edad;
    }
    /**
     * Metodo para establecer el valor de la variable habitad
     * @param tipo_habitad
     */
    public void establecer_habitad(String tipo_habitad){
        habitad = tipo_habitad; 
    }
    /**
     * Método para establecer el valor de la variable tipo_de_reproduccion
     * @param tipo_reprod
     */
    public void establecer_tipo_de_reproduccion(String tipo_reprod){
        tipo_de_reproduccion= tipo_reprod;
    }
    /**
     * Método para establecer el valor de la variable cantidad_extremidades
     * @param valor_extremidades
     */
    public void establecer_cantidad_extremidades(int valor_extremidades){
        cantidad_extremidades = valor_extremidades;
    }
    /**
     * Método para obtener los datos de un Animal.
     */
    public void obtener_datos_animal(){
        String datos_animal="Tipo de Alimentacion: "+tipo_de_alimento+"\nEdad: "+edad+"\nHabitad: "+ habitad + "\nTipo de Reproduccion: "+tipo_de_reproduccion+"\nCantidad Extremidades: "+cantidad_extremidades;
        System.out.println("**CARACTERISTICAS ANIMAL** \n"+datos_animal);
    }
        
}