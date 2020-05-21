/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

/**
 *
 * @author Luz Ma
 */
public class Dia {
    private int numDia; 
    private String nombreDia; 

    public int getNumDia() {
        return numDia;
    }

    public void setNumDia(int numDia) {
        this.numDia = numDia;
    }

    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }
    public void calcularNombreDia(){
        switch(numDia){
            case 1: 
                nombreDia = "LUNES";
                break;
            case 2:
                nombreDia = "MARTES";
                break;
            case 3: 
                nombreDia = "MIERCOLES";
                break;
            case 4: 
                nombreDia = "JUEVES";
                break;
            case 5: 
                nombreDia = "VIERNES";
                break; 
            case 6: 
                nombreDia = "SABADO";
                break; 
            case 7: 
                nombreDia = "DOMINGO";
                break; 
            default: nombreDia = "VALOR INGRESADO INCORRECTO";  
        }
    }
}
