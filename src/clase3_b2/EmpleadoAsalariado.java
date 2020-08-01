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
public class EmpleadoAsalariado extends Empleado {
    private double sueldo_mensual; 

    public void setSueldo_mensual(double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    @Override
    public void caluclarSueldoQna() {
        sueldo = sueldo_mensual / 2; 
    }
    
    
}
