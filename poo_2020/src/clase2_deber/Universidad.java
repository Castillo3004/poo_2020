/*
 *Clase Universidad, para poder obtener los datos de un Universidad cualquiera
 */
package clase2_deber;
public class Universidad {
    //Variables, atributos, caracteristicas o propiedades de la clase Universidad
    private String sectorizacion;
    private String direccion;
    private String rector;
    private int precio_matricula;
    private String categoria;
    
    //Vamos a encapsular los atributos con ayuda de los metodos. 
    /**
     * Este metodo devuelve el valor contenido en la variable sectorizacion
     * @return sectorizacion
     */
    public String obtener_sectorizacion(){
        
        return sectorizacion; 
    }
    /**
     * Este método devuelve el valor contenido en la variable direccion
     * @return direccion
     */
    public String obtener_direccion(){
        
        return direccion;
    }
    /**
     * Este método devuelve el valor contenido en la variable rector
     * @return rector
     */
    public String obtener_rector(){
        
        return rector;
    }
    /**
     * Este método devuelve el valor contenido en la variable precio_matricula
     * @return precio_matricula
     */
    public int obtener_precio_matricula(){
        
        return precio_matricula;
    }
    /**
     * Este método devuelve el valor contenido en la variable categoria
     * @return categoria
     */
    public String obtener_categoria(){
        
        return categoria;
    }
    /**
     * Metodo para establecer el valor de la variable sectorizacion
     * @param tipo_sectorizacion
     */
    public void establecer_sectorizacion(String tipo_sectorizacion){
        sectorizacion = tipo_sectorizacion; 
    }
    /**
     * Metodo para establecer el valor de la variable direccion
     * @param tipo_direccion
     */
    public void establecer_direccion(String tipo_direccion){
        direccion= tipo_direccion;
    }
    /**
     * Metodo para establecer el valor de la variable rector
     * @param tipo_rector
     */
    public void establecer_rector(String tipo_rector){
        rector = tipo_rector; 
    }
    /**
     * Método para establecer el valor de la variable precio_matricula
     * @param valor_precio_matricula
     */
    public void establecer_precio_matricula(int valor_precio_matricula){
        precio_matricula= valor_precio_matricula;
    }
    /**
     * Método para establecer el valor de la variable categoria
     * @param tipo_categoria
     */
    public void establecer_categoria(String tipo_categoria){
        categoria= tipo_categoria;
    }
    /**
     * Método para obtener los datos de una Universidad.
     */
    public void obtener_datos_universidad(){
        String datos_universidad="Sectorizaciòn: "+sectorizacion+"\nDireccion: "+direccion+"\nRector: "+ rector+ "\nPrecio Matricula: "+precio_matricula+"\nCategoria: "+categoria;
        System.out.println("**CARACTERISTICAS UNIVERSIDAD** \n"+datos_universidad);
    }
        
}