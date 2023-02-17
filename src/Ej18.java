public class Ej18{

    public static void main(String[] args) throws Exception{
     int m[][] = new int[4][4];
    
     for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m.length; j++) {
            m[i][j] = (int)(Math.random()*10);
        }
     }

     for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m.length; j++) {
            System.out.print(m[i][j] + " ");
        }
        System.out.println("");
     }

     System.out.println("Transpuesta: ");
     for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m.length; j++) {
            System.out.print(m[j][i] + " ");
        }
        System.out.println("");
     }
    }
}

/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa). */