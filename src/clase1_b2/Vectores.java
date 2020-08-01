/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1_b2;

/**
 *
 * @author Luz Ma
 */
public class Vectores {
    private int vectorA[]= new int[5];
    private int vectorB[]=new int[5];
    private int producto;

    public void CalcularProducto(){
        for(int i = 0; i<vectorA.length;i++){
            producto += (vectorA [i]*vectorB[i]);
        }
    }
    public int[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(int[] vectorA) {
        this.vectorA = vectorA;
    }

    public int[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(int[] vectorB) {
        this.vectorB = vectorB;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }
    
}
