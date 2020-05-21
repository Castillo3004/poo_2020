
package clase5_deber;


public class Angulo {
    private double Angulo_A;
    private double Angulo_B;
    private double Angulo_C;
    private String Tipo_triangulo; 

    public void definirTipoTriangulo() {
        if(Angulo_A == 90 || Angulo_B == 90 || Angulo_C == 90){
            Tipo_triangulo = "Triangulo Rectangulo"; 
        }else if(Angulo_A  > 90 && Angulo_A < 180 || Angulo_B  > 90 && Angulo_B < 180||  Angulo_C > 90 && Angulo_C < 180){
            Tipo_triangulo = "Triangulo Obtusangulo";
        }else if(Angulo_A <  90 && Angulo_B <  90 && Angulo_C < 90){
            Tipo_triangulo = "Triangulo Acutangulo";
        }
    }
    public double getAngulo_A() {
        return Angulo_A;
    }

    public void setAngulo_A(double Angulo_A) {
        this.Angulo_A = Angulo_A;
    }

    public double getAngulo_B() {
        return Angulo_B;
    }

    public void setAngulo_B(double Angulo_B) {
        this.Angulo_B = Angulo_B;
    }

    public double getAngulo_C() {
        return Angulo_C;
    }

    public void setAngulo_C(double Angulo_C) {
        this.Angulo_C = Angulo_C;
    }

    public String getTipo_triangulo() {
        return Tipo_triangulo;
    }

    
    
}
