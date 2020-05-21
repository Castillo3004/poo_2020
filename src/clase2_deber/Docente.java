/*
 *Clase Docente, para poder obtener los datos de un Docente cualquiera
 */
package clase2_deber;
public class Docente {
    //Variables, atributos, caracteristicas o propiedades de la clase Docente
    private String area_academica;
    private String nombre;
    private String nacionalidad;
    private String nivel_de_enseñanza;
    private String genero;
    
    //Vamos a encapsular los atributos con ayuda de los metodos. 
    /**
     * Este metodo devuelve el valor contenido en la variable area_academica
     * @return area_academica
     */
    public String obtener_area_academica(){
        
        return area_academica; 
    }
    /**
     * Este método devuelve el valor contenido en la variable nombre
     * @return nombre
     */
    public String obtener_nombre(){
        
        return nombre;
    }
    /**
     * Este método devuelve el valor contenido en la variable nacionalidad
     * @return nacionalidad
     */
    public String obtener_nacionalidad(){
        
        return nacionalidad;
    }
    /**
     * Este método devuelve el valor contenido en la variable nivel_de_enseñanza
     * @return nivel_de_enseñanza
     */
    public String obtener_nivel_de_enseñanza(){
        
        return nivel_de_enseñanza;
    }
    /**
     * Este método devuelve el valor contenido en la variable genero
     * @return genero
     */
    public String obtener_genero(){
        
        return genero;
    }
    /**
     * Metodo para establecer el valor de la variable area_academica
     * @param tipo_area_acad
     */
    public void establecer_area_academica(String tipo_area_acad){
        area_academica = tipo_area_acad; 
    }
    /**
     * Metodo para establecer el valor de la variable nombre
     * @param tipo_nombre 
     */
    public void establecer_nombre(String tipo_nombre){
        nombre = tipo_nombre; 
    }
    /**
     * Metodo para establecer el valor de la variable nacionalidad
     * @param tipo_nacionalidad
     */
    public void establecer_nacionalidad(String tipo_nacionalidad){
        nacionalidad = tipo_nacionalidad; 
    }
    /**
     * Método para establecer el valor de la variable nivel_de_enseñanza
     * @param tipo_lvl_enseñanza 
     */
    public void establecer_nivel_de_enseñanza(String tipo_lvl_enseñanza){
        nivel_de_enseñanza = tipo_lvl_enseñanza;
    }
    /**
     * Método para establecer el valor de la variable genero
     * @param tipo_genero
     */
    public void establecer_genero(String tipo_genero){
        genero = tipo_genero;
    }
    /**
     * Método para obtener los datos del Docente.
     */
    public void obtener_datos_docente(){
        String datos_docente="Área Academica: "+area_academica+"\nNombre: "+nombre+"\nNacionalidad: "+ nacionalidad + "\nNivel de Enseñanza: "+nivel_de_enseñanza+"\nGenero: "+genero;
        System.out.println("**DATOS DOCENTE** \n"+datos_docente);
    }
        
}