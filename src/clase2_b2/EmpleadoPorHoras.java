
package clase2_b2;
/*
*Clase EmpleadoPorHoras es una clase hija de Empleado 
*/
public class EmpleadoPorHoras extends Empleado {
    
    private int horas;
    private double cuota;
    private double sueldo_quincenal;

    
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getSueldo_quincenal() {
        return sueldo_quincenal;
    }

    public void setSueldo_quincenal(double sueldo_quincenal) {
        this.sueldo_quincenal = sueldo_quincenal;
    }
    public void calcular_suledo_quincenal(){
        sueldo_quincenal = horas * cuota; 
    }
}
