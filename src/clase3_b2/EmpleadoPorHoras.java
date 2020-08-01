/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3_b2;

/**
 *
 * @author Luz Ma
 */
public class EmpleadoPorHoras extends Empleado {
    private int horas; 
    private double cuota; 

    
    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    @Override
    public void caluclarSueldoQna(){
        sueldo = horas * cuota; 
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
