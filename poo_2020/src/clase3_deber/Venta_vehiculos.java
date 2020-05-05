package clase3_deber;

public class Venta_vehiculos {
    
    private float precio_vehiculo;
    private int año_fabricacion; 
    private String marca ;
    private float kilometraje;
    private String placa;
    
    public float get_precio_vehiculo(){
    return precio_vehiculo;
    }
    /**
     * Método para establecer el valor de la velocidad en el atributo velocidad
     * @param p_vehiculo
     */
    public void set_precio_vehiculo(float p_vehiculo){
        if(p_vehiculo > 0){
            precio_vehiculo = p_vehiculo;
        }else{ 
            System.err.println("PRECIO VEHICULO INVALIDA");
        }
    }

    public float get_año_fabricacion(){
        return año_fabricacion;
    }

    public void set_año_fabricacion(int a_fabricacion) {
        if(a_fabricacion>0){
            año_fabricacion = a_fabricacion ;
        }else{ 
            System.err.println("AÑO FABRICACIÓN INVALIDO");
        }
    }
    public String get_marca() {
        return marca;
    }

    public void set_marca(String marca) {
        this.marca = marca;
    }
    public float get_kilometraje() {
        return kilometraje;
    }

    public void set_kilometraje(float kilometraje) {
        if(kilometraje > 0){
            this.kilometraje = kilometraje;
        }else{
            System.err.println("KILOMETRAJE INVALIDO");
        }
    }
    public String get_placa() {
        return marca;
    }

    public void set_placa(String placa) {
        this.placa = placa;
    }
    
}