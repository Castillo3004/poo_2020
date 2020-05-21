/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5_deber;


public class Terreno {
    private double largo; 
    private double ancho; 
    private double precio_m; 
    private double precio_terr; 
    
    
    public void calcularPrecioTerr(){
        if((largo*ancho)> 400){
            precio_terr = ((largo*ancho) * precio_m)*0.90;
        }else{
            precio_terr = ((largo*ancho)* precio_m);
        }
    }
    
    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getPrecio_m() {
        return precio_m;
    }

    public void setPrecio_m(double precio_m) {
        this.precio_m = precio_m;
    }

    
    public double getPrecio_terr() {
        return precio_terr;
    }

    public void setPrecio_terr(double precio_terr) {
        this.precio_terr = precio_terr;   
    } 
}
