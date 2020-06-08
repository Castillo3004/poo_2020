
package clase5;

public class Empleado {
    private String nombre;
    private int horas; 
    private double cuota; 
    private double sueldo; 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public void calcularSueldo(){
        if(horas<= 40){
            sueldo = horas * cuota;
        }else{
            sueldo = (40*cuota)+((horas-40)*(cuota*2)); 
        }
    }
}