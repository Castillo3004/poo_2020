/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5_deber;

/**
 *
 * @author Luz Ma
 */
public class NotaEstudiante {
    private String nombre;
    private double pri_calif;
    private double seg_calif;
    private double ter_calif;
    private boolean prc = false ;
    private boolean sgc = false;
    private boolean tcc;
    private double calif_final;

    public void CalcularPrc(){
        if(pri_calif >= 70){
            prc = true;
        }
    }
    
    public void CalcularSgc(){
        if(seg_calif >= 70){
            sgc = true;
        }
    }
    
    public void CalcularTcc(){
        if(ter_calif >= 70){
            tcc = true; 
        }
    }
    public void calcularCalificacionFinal(){
        calif_final = (pri_calif + seg_calif + ter_calif)/3;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPri_calif() {
        return pri_calif;
    }

    public void setPri_calif(double pri_calif) {
        this.pri_calif = pri_calif;
    }

    public double getSeg_calif() {
        return seg_calif;
    }

    public void setSeg_calif(double seg_calif) {
        this.seg_calif = seg_calif;
    }

    public double getTer_calif() {
        return ter_calif;
    }

    public void setTer_calif(double ter_calif) {
        this.ter_calif = ter_calif;
    }

    public boolean isPrc() {
        return prc;
    }

    public void setPrc(boolean prc) {
        this.prc = prc;
    }

    public boolean isSgc() {
        return sgc;
    }

    public void setSgc(boolean sgc) {
        this.sgc = sgc;
    }

    public boolean isTcc() {
        return tcc;
    }

    public void setTcc(boolean tcc) {
        this.tcc = tcc;
    }

    public String getCalif_final() {
        if(prc && sgc && tcc != false){
            String Si = "Calificacion: "+calif_final;
             return Si;
        }else{
            String Na = "Calificacion: NA(NO ACREDITADO)";
            return Na;
        }
        
    }

    public void setCalif_final(double calif_final) {
        this.calif_final = calif_final;
    } 
}
