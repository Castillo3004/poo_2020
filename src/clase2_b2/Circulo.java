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
public class Circulo extends Figura{
    private double radio; 
    private double area;

    public Circulo(double radio,String nombre) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public void calcular_area_circulo(){
        area = Math.PI * Math.pow(radio, 2);
    }
}
