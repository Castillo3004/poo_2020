
package clase4;

public class Vehiculo {
private String placa; 
    private int velocidad;
    private String piloto;
    
    public Vehiculo(){
    }
    /*Inicializar valores a los atributosde nuestra clase*/
    public Vehiculo(String placa, int velocidad, String piloto){
        this.placa = placa; 
        this.velocidad = velocidad;
        this.piloto = piloto;
    }
    /*Metodo constructor para inicializar solamente la placa y piloto*/
    public Vehiculo ( String placa, String piloto){
        this.placa =placa;
        this.piloto = piloto;
    }
    
    public Vehiculo( String placa, int velocidad ){
        this.placa = placa;
        this.velocidad = velocidad;
    }
    public Vehiculo(int velocidad, String placa){
        this.velocidad = velocidad; 
        this.placa = placa;
    }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }
     
    
}
