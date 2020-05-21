/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5_deber;

/**
 *
 * @author Luz Ma
 */
public class Pedido {
    private String descripcion;
    private int cantidad;
    private double precio_unitario;
    private double precio_total;

    public void calcularPrecioTotal(){
        if (cantidad > 50){
            precio_total = (cantidad* precio_unitario)*0.85; 
        }else{
            precio_total = (cantidad * precio_unitario);
        }
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }
    
    
}
