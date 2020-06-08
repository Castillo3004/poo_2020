
package clase7;

public class Cajero {
    private double saldo;

    public Cajero(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito) {
        if (deposito > 0) 
            saldo += deposito;
    }

    public void retirar(double retiro) {

        if (saldo >= retiro && retiro > 0) 
            saldo -= retiro;
    }
    
    public double consultar_saldo(){
        return saldo;
    }
}
