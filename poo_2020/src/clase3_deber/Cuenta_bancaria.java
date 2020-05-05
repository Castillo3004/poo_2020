package clase3_deber;

public class Cuenta_bancaria {
    
    private Long numero_de_cuenta;
    private double valor_del_saldo; 
    private String nombre_del_socio ;
    
    public Long get_numero_de_cuenta(){
    return numero_de_cuenta;
    }
    /**
     * Método para establecer el valor de la velocidad en el atributo velocidad
     * @param n_cuenta
     */
    public void set_numero_de_cuenta(Long n_cuenta){
        if(n_cuenta > 0){
            numero_de_cuenta = n_cuenta ;
        }else{ 
            System.err.println("NUMERO DE CUENTA INVALIDO");
        }
    }

    public double get_valor_del_saldo() {
        return valor_del_saldo;
    }

    public void set_valor_del_saldo(float v_saldo) {
        if(v_saldo>0){
            valor_del_saldo = v_saldo ;
        }else{ 
            System.err.println("VALOR INVALIDO");
        }
    }
    public String get_nombre_del_socio() {
        return nombre_del_socio;
    }

    public void set_nombre_del_socio(String n_socio) {
        nombre_del_socio = n_socio;
    }
    
}