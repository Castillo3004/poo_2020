
package clase6_deber;

public class SumaPares {
    private int numeros; 
    private int sumapar;

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }
    public void CalculaPar(){
        if(numeros % 2 == 0){
            sumapar += numeros;
        }
    }
    public int ObtenerPar(){
        return sumapar; 
    }
}
