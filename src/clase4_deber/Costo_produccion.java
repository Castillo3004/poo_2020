package clase4_deber;

public class Costo_produccion {
    private String descripcion; 
    private int unidades_p; 
    private float costo_m;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUnidades_p() {
        return unidades_p;
    }

    public void setUnidades_p(int unidades_p) {
        this.unidades_p = unidades_p;
    }

    public float getCosto_m() {
        costo_m = (float) 3.5;
        return costo_m;
    }

    public void setCosto_m(float costo_m) {
        this.costo_m = costo_m;
    }
    
}
