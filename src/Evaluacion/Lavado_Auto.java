package Evaluacion;

public class Lavado_Auto {
   private String modelo; 
   private String marca; 
   private String placa; 
   private int dia; 
   private int tipo_lavado; 
   private double valor_lavado; 
   
    public void Calcular_valor_lavado(){
        if(dia == 1 ){
            if(tipo_lavado == 1){
                valor_lavado = 3 * 0.8;
            }else if(tipo_lavado == 2){
                valor_lavado = 5 * 0.8;
            }else if (tipo_lavado == 3){
                valor_lavado = 10 * 0.8; 
            }
        }else if( dia == 2){
            if(tipo_lavado == 1){
            valor_lavado = 3;
            }else if(tipo_lavado == 2){
                valor_lavado = 5;
            }else if (tipo_lavado == 3){
                valor_lavado = 10 * 0.9; 
            }
        }else if ( dia == 3 || dia == 4 || dia == 5 || dia == 6 || dia == 7){
            if(tipo_lavado == 1){
            valor_lavado = 3;
            }else if(tipo_lavado == 2){
                valor_lavado = 5;
            }else if (tipo_lavado == 3){
                valor_lavado = 10 ; 
            }
        }
    }
   public double get_valor_lavado(){
       return valor_lavado;
   }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getTipo_lavado() {
        return tipo_lavado;
    }

    public void setTipo_lavado(int tipo_lavado) {
        this.tipo_lavado = tipo_lavado;
    }
   
}
