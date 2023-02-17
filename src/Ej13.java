import java.util.Scanner;

public class Ej13{

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i==0 || i == N-1 || j == 0 || j == N-1)
                    System.out.print("*  ");
                else System.out.print("   ");
            }
            System.out.println(" ");
            
        }

        scanner.close();

    }
}
/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */