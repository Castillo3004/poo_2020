/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2_b2;


public class EmpleadoAsalariado extends Empleado{
    private double sueldo_mensual; 
    private double sueldo_quincenal; 

    public double getSueldo_mensual() {
        return sueldo_mensual;
    }

    public void setSueldo_mensual(double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    public double getSueldo_quincenal() {
        return sueldo_quincenal;
    }

    public void setSueldo_quincenal(double sueldo_quincenal) {
        this.sueldo_quincenal = sueldo_quincenal;
    }
    public void calcular_sueldo_quincenal(){
        sueldo_quincenal = sueldo_mensual / 2;
    }
    
}
