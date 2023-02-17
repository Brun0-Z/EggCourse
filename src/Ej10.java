import java.util.Scanner;

public class Ej10{

    public static void main(String[] args) throws Exception{
     Scanner scanner = new Scanner(System.in);
     double limP = scanner.nextDouble(), num, sum = 0;

     do{
        num = scanner.nextDouble();
        sum += num;
     } while(sum < limP);
     scanner.close();
    }
}
/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial. */