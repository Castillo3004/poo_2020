package clase6_deber;
public class EstadoCuenta {
    private String nombre; 
    private double saldo_inicial;
    private double deposito;
    private double retiro; 
    private double actua_depos; 
    

    public EstadoCuenta(String nombre, double saldo_inicial) {
        this.nombre = nombre;
        this.saldo_inicial = saldo_inicial;
    }

    public double getDeposito() {
        return actua_depos;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getRetiro() {
        return actua_depos;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }
    
    public void CalculaDeposito(){
        actua_depos += deposito + saldo_inicial;
    }
    public void CalculaRetiro(){
        actua_depos -= retiro -saldo_inicial; 
    }
    
}
