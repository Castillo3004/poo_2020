/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2_b2;

/**
 *
 * @author Luz Ma
 */
public class Cuadrado extends Figura{
    private double lado;
    private double area;

    public Cuadrado(double lado,String nombre) {
        super(nombre);
        this.lado = lado; 
    }

    public double getLado() {
        return lado;
    }

    public double getArea() {
        return area;
    }
    public void calcular_area_cuadrado(){
        area = (lado*lado);    
    }
}
