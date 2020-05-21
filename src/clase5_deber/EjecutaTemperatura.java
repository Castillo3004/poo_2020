package clase5_deber;

import java.util.Scanner;

public class EjecutaTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grad;
        String presentar;
        int op;
        Temperatura objTemp = new Temperatura();
        System.out.println("CONVERTIDOR DE TEMPERATURA\n");
        System.out.println("Por Favor digite el numero segun el de tipo de Grados: \n\n1. Fahrenheit \n2. Celsius \n3. Kelvin \n4. Rankine");
        op = sc.nextInt();
        System.out.println("Por favor ingrese los Grados: ");
        grad = sc.nextDouble();
	objTemp.setFaC(grad);
	objTemp.setFaK(grad);
	objTemp.setFaR(grad);
	objTemp.setCaF(grad);
	objTemp.setCaK(grad);
	objTemp.setCaR(grad);
	objTemp.setKaF(grad);
	objTemp.setKaC(grad);
	objTemp.setKaR(grad);
	objTemp.setRaF(grad);
	objTemp.setRaC(grad);
	objTemp.setRaK(grad);
        switch (op){
            case 1: 
                presentar = ("Usted ha ingresado "+objTemp.getGrados()+" Fahrenheit, su conversion es: \n\nCelcius: "+objTemp.getFaC()+"\nKelvin: "+objTemp.getFaK()+"\nRankine: "+objTemp.getFaR());
                break;
            case 2:
                presentar = ("Usted ha ingresado "+objTemp.getGrados()+" Celsius, su conversion es: \n\nFahrenheit: "+objTemp.getCaF()+"\nKelvin: "+objTemp.getCaK()+"\nRankine: "+objTemp.getCaR());
                break;
            case 3: 
                presentar = ("Usted ha ingresado "+objTemp.getGrados()+" Kelvin, su conversion es: \n\nFahrenheit: "+objTemp.getKaF()+"\nCelcius: "+objTemp.getKaC()+"\nRankine: "+objTemp.getKaR());
                break;
            case 4: 
                presentar = ("Usted ha ingresado "+objTemp.getGrados()+" Rankine, su conversion es: \n\nFahrenheit: "+objTemp.getRaF()+"\nCelcius: "+objTemp.getRaC()+"\nKelvin: "+objTemp.getRaK());
                break;
        }
               
    
    }
		 
}
