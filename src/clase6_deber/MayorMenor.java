package clase6_deber;

public class MayorMenor {
    private double mayor;
    private double menor; 
    private double numeros; 


    public double getMayor() {
        return mayor;
    }
    public double getMenor(){
        return menor;
    }   

    public double getNumeros() {
        return numeros;
    }

    public void setNumeros(double numeros) {
        this.numeros = numeros;
    }
    public void CalculaMayorMenor() {            
        if(numeros > mayor){
            mayor = numeros;
        }
        if(numeros < menor){
            menor = numeros;
        }
       
        
    }  
    
    
}
