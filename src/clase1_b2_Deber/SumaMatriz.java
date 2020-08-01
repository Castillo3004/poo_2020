
package clase1_b2_Deber;

public class SumaMatriz {
    private int fil;
    private int col;
    private int matriz [][]= new int[fil][col];
    private int suma; 
    private double promedio; 

    public SumaMatriz(int fil, int col,int matriz[][]) {
        this.fil = fil;
        this.col = col;
        this.matriz = matriz;
    }

    public void Suma (){
        for(int i = 0; i<matriz.length;i++ ){
            for(int j=0;j<matriz[0].length;j++){
                suma += matriz[i][j];
            }
        }
    }
    public void promedio(){
        promedio = (double)suma/(fil*col);
    }
  
    
    public int getSuma() {
        return suma;
    }

    public double getPromedio() {
        return promedio;
    }
    
    
}
