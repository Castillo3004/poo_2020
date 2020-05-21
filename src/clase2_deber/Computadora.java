/*
 *Clase Computadora, para poder obtener los datos de una Computadora cualquiera
 */
package clase2_deber;
public class Computadora {
    //Variables, atributos, caracteristicas o propiedades de la clase Computadora
    private String marca_placa_base;
    private String sistema_operativo;
    private String marca_tarjeta_grafica;
    private String tamaño_disco_duro;
    private String marca_cpu;
    
    //Vamos a encapsular los atributos con ayuda de los metodos. 
    /**
     * Este metodo devuelve el valor contenido en la variable marca_placa_base
     * @return marca_placa_base
     */
    public String obtener_marca_placa_base(){
        
        return marca_placa_base; 
    }
    /**
     * Este método devuelve el valor contenido en la variable sistema_operativo
     * @return sistema_operativo
     */
    public String obtener_sistema_operativo(){
        
        return sistema_operativo;
    }
    /**
     * Este método devuelve el valor contenido en la variable marca_tarjeta_grafica
     * @return marca_tarjeta_grafica
     */
    public String obtener_tarjeta_grafica(){
        
        return marca_tarjeta_grafica;
    }
    /**
     * Este método devuelve el valor contenido en la variable tamaño_disco_duro
     * @return tamaño_disco_duro
     */
    public String obtener_disco_duro(){
        
        return tamaño_disco_duro;
    }
    /**
     * Este método devuelve el valor contenido en la variable marca_cpu
     * @return marca_cpu
     */
    public String obtener_cpu(){
        
        return marca_cpu;
    }
    /**
     * Metodo para establecer el valor de la variable marca_placa_base
     * @param tipo_placa_base
     */
    public void establecer_marca_placa(String tipo_placa_base){
        marca_placa_base= tipo_placa_base; 
    }
    /**
     * Metodo para establecer el valor de la variable sistema_operativo
     * @param tipo_SO
     */
    public void establecer_sistema_operativo(String tipo_SO){
        sistema_operativo = tipo_SO; 
    }
    /**
     * Metodo para establecer el valor de la variable marca_tarjeta_grafica
     * @param tipo_tarj_grafica
     */
    public void establecer_marca_tarjeta_grafica(String tipo_tarj_grafica){
        marca_tarjeta_grafica = tipo_tarj_grafica; 
    }
    /**
     * Método para establecer el valor de la variable tamaño_disco_duro
     * @param tipo_tam_disco_duro
     */
    public void establecer_tamaño_disco_duro(String tipo_tam_disco_duro){
        tamaño_disco_duro= tipo_tam_disco_duro;
    }
    /**
     * Método para establecer el valor de la variable marca_cpu
     * @param tipo_marca_cpu
     */
    public void establecer_marca_cpu(String tipo_marca_cpu){
        marca_cpu = tipo_marca_cpu;
    }
    /**
     * Método para obtener los datos del Docente.
     */
    public void obtener_datos_computadora(){
        String datos_computadora="Modelo Placa Base: "+marca_placa_base+"\nSistema Operativo: "+sistema_operativo+"\nModelo Tarjeta Grafica: "+ marca_tarjeta_grafica + "\nTamaño Disco Duro: "+tamaño_disco_duro+"\nMarca CPU: "+marca_cpu;
        System.out.println("**CARACTERISTICAS COMPUTADORA** \n"+datos_computadora);
    }
        
}