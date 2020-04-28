/*
 *Clase Estudiante, para poder obtener los datos de un Estudiante cualquiera
 */
package clase2_deber;
public class Estudiante {
    //Variables, atributos, caracteristicas o propiedades de la clase Estudiante
    private String etnia;
    private String carrera;
    private String modalidad;
    private int numero_carnet_universitario;
    private String numero_cedula;
    
    //Vamos a encapsular los atributos con ayuda de los metodos. 
    /**
     * Este metodo devuelve el valor contenido en la variable etnia
     * @return etnia
     */
    public String obtener_etnia(){
        
        return etnia; 
    }
    /**
     * Este método devuelve el valor contenido en la variable carrera
     * @return carrera
     */
    public String obtener_carrera(){
        
        return carrera;
    }
    /**
     * Este método devuelve el valor contenido en la variable modalidad 
     * @return modalidad
     */
    public String modalidad(){
        
        return modalidad;
    }
    /**
     * Este método devuelve el valor contenido en la variable numero_carnet_universitario
     * @return numero_carnet_universitario 
     */
    public int obtener_numero_carnet(){
        
        return numero_carnet_universitario;
    }
    /**
     * Este método devuelve el valor contenido en la variable numero_cedula
     * @return numero_cedula
     */
    public String obtener_numero_cedula(){
        
        return numero_cedula;
    }
    /**
     * Metodo para establecer el valor de la variable etnia
     * @param tipo_etnia 
     */
    public void establecer_etnia(String tipo_etnia){
        etnia = tipo_etnia; 
    }
    /**
     * Metodo para establecer el valor de la variable carrera 
     * @param tipo_carrera  
     */
    public void establecer_carrera(String tipo_carrera){
        carrera = tipo_carrera; 
    }
    /**
     * Metodo para establecer el valor de la variable modalidad
     * @param tipo_modalidad
     */
    public void establecer_modalidad(String tipo_modalidad){
        modalidad = tipo_modalidad; 
    }
    /**
     * Método para establecer el valor de la variable numero_carnet_universitario
     * @param valor_n_carnet 
     */
    public void establecer_numero_carnet(int valor_n_carnet){
        numero_carnet_universitario = valor_n_carnet;
    }
    /**
     * Método para establecer el valor de la variable valor_cedula
     * @param valor_cedula 
     */
    public void establecer_numero_cedula(String valor_cedula){
        numero_cedula = valor_cedula;
    }
    /**
     * Método para obtener los datos del estudiante.
     */
    public void obtener_datos_estudiante(){
        String datos_estudiante="Etnia Estudiante: "+etnia+"\nCarrera Estudiante: "+carrera+"\nModalidad: "+ modalidad + "\nNúmero de Carnet Universitario: "+numero_carnet_universitario+"\nNumero de Cedula: "+numero_cedula;
        System.out.println("**DATOS ESTUDIANTE** \n"+datos_estudiante);
    }
        
}
