
package clase5_deber;

public class Temperatura {
    private int tipo_temp;
    private double grados; 
                                                        
    public int getTipo_temp() {
        return tipo_temp;
    }

    public void setTipo_temp(int tipo_temp) {
        this.tipo_temp = tipo_temp;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public double getFaC() {
        return grados;
    }

    public void setFaC(double grados) {
        this.grados = (grados - 32)*(5/9);
    }

    public double getFaK() {
        return grados;
    }

    public void setFaK(double grados) {
        this.grados = (grados - 32)*5/9+273;
    }

    public double getFaR() {
        return grados;
    }

    public void setFaR(double grados) {
        this.grados = grados + 460;
    }

    public double getCaF() {
        return grados;
    }

    public void setCaF(double grados) {
        this.grados = (grados * 9/5)+32;
    }

    public double getCaK() {
        return grados;
    }

    public void setCaK(double grados) {
        this.grados = grados +273;
    }

    public double getCaR() {
        return grados;
    }

    public void setCaR(double grados) {
        this.grados = (grados * 9/5)+491;
    }

    public double getKaF() {
        return grados;
    }

    public void setKaF(double grados) {
        this.grados = (grados -273)*9/5 +32;
    }

    public double getKaC() {
        return grados;
    }

    public void setKaC(double grados) {
        this.grados = grados -273;
    }

    public double getKaR() {
        return grados;
    }

    public void setKaR(double grados) {
        this.grados = grados * 1.8;
    }

    public double getRaF() {
        return grados;
    }

    public void setRaF(double grados) {
        this.grados = grados - 460;
    }

    public double getRaC() {
        return grados;
    }

    public void setRaC(double grados) {
        this.grados = (grados - 491)* 5/9;
    }

    public double getRaK() {
        return grados;
    }

    public void setRaK(double grados) {
        this.grados = grados * 5/9 ;
    }
                                               
							  
}
