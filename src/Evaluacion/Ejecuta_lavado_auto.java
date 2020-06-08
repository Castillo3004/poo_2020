package Evaluacion;

import java.util.Scanner;

public class Ejecuta_lavado_auto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mod,mar,plac;
        int day, t_lavado; 
        int aux1=0, aux2=0, aux3=0;
        int total_autos,opc = 1; 
        String cadena = null;
        Lavado_Auto objAutomovil = new Lavado_Auto();
        System.out.println("PRECIO DE LAVADO POR VEHICULO");
        System.out.println("=============================");
        do{
            System.out.println("Digite el numero segun corresponda: \n1.- Ingresar nuevo vehiculo\n0.- Finalizar Programa");       
            System.out.println("\nPor Favor ingrese el modelo del vehiculo: ");
            mod = sc.next();
            System.out.println("Por Favor ingrese la marca del vehiculo: ");
            mar = sc.next();
            System.out.println("Por Favor ingrese la placa del vehiculo: ");
            plac = sc.next();
            System.out.println("Por Favor ingrese el numero del dia que esta lavando el Vehiculo segun se indica a continuación: \n\n1.- Lunes\n2.- Martes\n3.- Miercoles\n4.- Jueves\n5.- Viernes\n6.- Sabado\n7.- Domingo");
            day = sc.nextInt();
            System.out.println("Por favor Ingrese el numero del tipo de lavado que desea realizar segun se indica a continuación: \n\n1.- Lavado Express $3\n2.- Lavada Media $5\n3.- Lavada Completa $10 ");
            t_lavado = sc.nextInt();
            objAutomovil.setModelo(mod);
            objAutomovil.setMarca(mar);
            objAutomovil.setPlaca(plac);
            objAutomovil.setDia(day);
            objAutomovil.setTipo_lavado(t_lavado);
            if( t_lavado == 1){
                aux1 ++;
            }else if( t_lavado == 2){
                aux2 ++;
            }else if (t_lavado == 3){
                aux3 ++;
            }
            objAutomovil.Calcular_valor_lavado();
            total_autos = aux1+ aux2+aux3; 
            cadena += ("FICHA DEL AUTOMOVIL LAVADO \nModelo: "+objAutomovil.getModelo()+"\nMarca: "+objAutomovil.getMarca()+"\nPlaca: "+objAutomovil.getPlaca()+"\nValor Lavado: $"+objAutomovil.get_valor_lavado());
        }while(opc == 0);
        System.out.println("Los Automoviles Lavados son: \n\nLavado Express: "+aux1+"\nMedia Lavada: "+aux2+"\nLavado Completo: "+aux3);
        System.out.println("El Total de Vehiculo Lavado son: "+total_autos);
        System.out.println("Gracias por usar el programa");
    }
}
