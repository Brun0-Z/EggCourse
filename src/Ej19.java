

public class Ej19{

    public static void main(String[] args) throws Exception{
        int M[][] = new int[10][10], P[][] = new int[10][10];
        FillM(M);
        TraspM(M,P);
        boolean AT = CheckAT(M,P);
        System.out.println("AT: " + AT);
    }
    private static boolean CheckAT(int[][] m, int[][] p) {
        boolean AT = true;
        for (int i = 0; i < p.length && AT; i++) {
            for (int j = 0; j < p.length && AT; j++) {
                if(p[i][j] != -m[i][j]) AT = false;
            }            
        }
        return AT;
    }
    private static void TraspM(int[][] m,int[][] p) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                p[i][j] = m[j][i];
            }
        }
    }
    private static void FillM(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = (int)(Math.random()*10);
            }
        }
    }
}

/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa). */