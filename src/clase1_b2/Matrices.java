
package clase1_b2;
public class Matrices {
    private int matrizA[][] = new int [3][3];
    private int matrizB[][] = new int [3][3];
    private int matrizC[][] = new int [3][3];

    public void Sumar(){
        for(int i = 0; i < matrizA.length;i++){
            for(int j = 0 ; j < matrizA[0].length;j++){
                matrizC[i][j]= matrizA[i][j]+matrizB[i][j];
            }
        }
    }
    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public int[][] getMatrizB() {
        return matrizB;
    }

    public void setMatrizB(int[][] matrizB) {
        this.matrizB = matrizB;
    }

    public int[][] getMatrizC() {
        return matrizC;
    }

    public void setMatrizC(int[][] matrizC) {
        this.matrizC = matrizC;
    }
    
}
