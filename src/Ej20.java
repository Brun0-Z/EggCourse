import java.util.Scanner;

public class Ej20{

    public static void main(String[] args) throws Exception{
     int M[][] = new int[3][3];
     Scanner scanner = new Scanner(System.in);
     for (int i = 0; i < M.length; i++) {
        for (int j = 0; j < M.length; j++) {
            do{
            M[i][j] = scanner.nextInt();
            }while(M[i][j] < 1 || M[i][j] > 9);
        }
     }
     verificar(M);
     scanner.close();
    }

    public static void verificar(int[][] matriz) {
        int sumaEsperada = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int sumaFila;
        int sumaColumna;
        int sumaInversa = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
                if (i + j == matriz.length - 1) {
                    sumaInversa += matriz[i][j];
                }
            }
            if (sumaEsperada != sumaFila) {
                System.out.println("La matriz NO es mágica");
                break;
            }
            if (sumaEsperada != sumaColumna) {
                System.out.println("La matriz NO es mágica");
                break;
            }
        }
        if (sumaEsperada != sumaInversa) {
            System.out.println("La matriz NO es mágica");
        } else {
            System.out.println("La matriz es mágica");
        }
    }

}

/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9. */