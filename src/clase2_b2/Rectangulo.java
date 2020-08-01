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
public class Rectangulo extends Figura{
    private double base;
    private double altura;
    private double area;

    public Rectangulo(double base, double altura,String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public void calcular_area_rectangulo(){
            area = (base*altura );    
    }
           
}
