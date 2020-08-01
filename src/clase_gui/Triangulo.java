/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_gui;

/**
 *
 * @author Luz Ma
 */
public class Triangulo {
    private double base; 
    private double altura; 
    private double area; 
    
    public Triangulo(double base, double altura){
        this.base = base; 
        this.altura = altura; 
    }
    
    public void CalcularArea(){
        area = (base * altura)/2; 
    }
    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }
    
    
}
