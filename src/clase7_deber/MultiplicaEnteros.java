
package clase7_deber;

public class MultiplicaEnteros {
    private int numero1;
    private int numero2;
    private int total;
    
    public void CalculaMultiplicacion(){
        for (int i = 0; i < numero2; i++) {
            total += numero1;
        }
    }
   
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getTotal() {
        return total;
    }
    
  
}
