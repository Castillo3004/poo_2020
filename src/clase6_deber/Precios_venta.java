
package clase6_deber;

public class Precios_venta {
    private String descripicion; 
    private double costo_p;
    private double utilidad; 
    private double impuesto; 
    private double precio_v; 

    public Precios_venta(String descripicion, double costo_p) {
        this.descripicion = descripicion;
        this.costo_p = costo_p;
    }

    public double getUtilidad() {
        return utilidad;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public double getPrecio_v() {
        return precio_v;
    }

    public String getDescripicion() {
        return descripicion;
    }

    public double getCosto_p() {
        return costo_p;
    }

    public void calculoUtilidad(){
        utilidad = costo_p * 1.20; 
    }
    public void calculoImpuesto(){
        impuesto = (costo_p + utilidad)*0.85;
    }
    public void calucloPrecioVenta(){
        precio_v = (costo_p+utilidad+impuesto);
    }
}
