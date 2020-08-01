
package clase1_b2_Deber;

public class MatrizTranspuesta {
    private int fil;
    private int col; 
    private int matA[][]= new int[fil][col];
    private int matB[][];

    public MatrizTranspuesta(int fil, int col) {
        this.fil = fil;
        this.col = col;
    }

    public void setMatA(int[][] matA) {
        this.matA = matA;
    }
    
 
    public void Transpuesta(){
        for (int i=0;i<matA.length;i++){
            for(int j=0;j<matA[0].length;j++){
                matB[j][i]=matA[i][j];
            }
        }
    }
    public int [][]getMatB(){
        return matB;
    }
}
