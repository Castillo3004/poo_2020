package clase7_deber;

public class RestaRepetir {
    private int numero1;
    private int numero2;
    private int total;

    public void CalculaDivision() {
        total =0;
        while (numero1>=numero2){
            numero1 -= numero2;
            total ++;
        }   
    }
    
    public int getTotal() {
        return total;
    }
    
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    
}
