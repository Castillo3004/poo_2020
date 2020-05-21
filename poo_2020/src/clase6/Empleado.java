/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;

/**
 *
 * @author Luz Ma
 */
public class Empleado {
    private String nombre;
    private int horas; 
    private double cuota; 
    private double sueldo; 
    private double sueldotl;
    
     public Empleado(String nombre, int horas, double cuota){
         this.nombre = nombre;
         this.horas = horas;
         this.cuota = cuota; 
         
     }
     public void calcularSueldo(){
         if(horas <= 40){
             sueldo = horas * cuota; 
         }else{
             sueldo = (40 * cuota)+((horas-40)*(cuota*2));
         }
     }

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
}
