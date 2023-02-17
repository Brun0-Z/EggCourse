public class Ej21{

    public static void main(String[] args) throws Exception{
     
        int M[][] = new int[10][10], P[][] = {{36,5,67},{89,90,75},{14,22,26}};
        fillM(M); 

        boolean founded = false, pfounded = true;
        for (int i = 0; i < M.length - 2 && !founded; i++) {
            for (int j = 0; j < M[i].length - 2 && !founded; j++) {
                if(M[i][j] == P[0][0]){
                    int partialMatch = 0;

                    for (int k = 0; k < P.length && pfounded; k++) {
                        for (int h = 0; h < P[k].length && pfounded;  h++) {
                            pfounded = M[i + k][j + h] == P[k][h];
                            partialMatch++;
                        }
                        
                    }
                    if(partialMatch > 8 && pfounded){
                    System.out.println("Encontrado en: " + i + j);
                    return;
                    }
               
                }
            }
            System.out.println("No match");
        }
    }

    private static void fillM(int[][] p) {
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                p[i][j] = (int)(Math.random()*10);
            }
        }
    }

}

/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:
4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
*/