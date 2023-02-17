import java.util.Scanner;

public class Ej6{

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        System.out.println(esPar(a));
    }

    private static boolean esPar(int a) {
        return a%2==0 ? true : false;
    }

    
}

/*Crear un programa que dado un numero determine si es par o impar. */