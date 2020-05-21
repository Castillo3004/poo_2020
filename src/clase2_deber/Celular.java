/*
 *Clase Celular, para poder obtener los datos de un Celular cualquiera
 */
package clase2_deber;
public class Celular {
    //Variables, atributos, caracteristicas o propiedades de la clase Celular
    private String marca;
    private String sistema_operativo;
    private String procesador;
    private float tamaño_pantalla;
    private int tamaño_ram;
    
    //Vamos a encapsular los atributos con ayuda de los metodos. 
    /**
     * Este metodo devuelve el valor contenido en la variable marca
     * @return marca
     */
    public String obtener_marca(){
        
        return marca; 
    }
    /**
     * Este método devuelve el valor contenido en la variable sistema_operativo
     * @return sistema_operativo
     */
    public String obtener_sistema_operativo(){
        
        return sistema_operativo;
    }
    /**
     * Este método devuelve el valor contenido en la variable procesador
     * @return procesador
     */
    public String obtener_procesador(){
        
        return procesador;
    }
    /**
     * Este método devuelve el valor contenido en la variable tamaño_pantalla
     * @return tamaño_pantalla
     */
    public float obtener_tamaño_pantalla(){
        
        return tamaño_pantalla;
    }
    /**
     * Este método devuelve el valor contenido en la variable tamaño_ram
     * @return tamaño_ram
     */
    public int obtener_tamaño_ram(){
        
        return tamaño_ram;
    }
    /**
     * Metodo para establecer el valor de la variable marca
     * @param tipo_marca
     */
    public void establecer_marca(String tipo_marca){
        marca = tipo_marca; 
    }
    /**
     * Metodo para establecer el valor de la variable sistema_operativo
     * @param tipo_sistema_operativo
     */
    public void establecer_sistema_operativo(String tipo_sistema_operativo){
        sistema_operativo= tipo_sistema_operativo;
    }
    /**
     * Metodo para establecer el valor de la variable procesador
     * @param tipo_procesador
     */
    public void establecer_procesador(String tipo_procesador){
        procesador = tipo_procesador; 
    }
    /**
     * Método para establecer el valor de la variable tamaño_pantalla
     * @param valor_tamaño_pantalla
     */
    public void establecer_tamaño_pantalla(float valor_tamaño_pantalla){
        tamaño_pantalla= valor_tamaño_pantalla;
    }
    /**
     * Método para establecer el valor de la variable tamaño_ram
     * @param valor_tamaño_ram
     */
    public void establecer_tamaño_ram(int valor_tamaño_ram){
        tamaño_ram = valor_tamaño_ram;
    }
    /**
     * Método para obtener los datos de un Celular.
     */
    public void obtener_datos_celular(){
        String datos_celular="Marca: "+marca+"\nSistema Operativo: "+sistema_operativo+"\nProcesador: "+ procesador+ "\nTamaño Pantalla: "+tamaño_pantalla+"\nTamaño RAM: "+tamaño_ram;
        System.out.println("**CARACTERISTICAS CELULAR** \n"+datos_celular);
    }
        
}