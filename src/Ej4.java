import java.util.Scanner;

public class Ej4{

    public static void main(String[] args) throws Exception{
     Scanner scanner = new Scanner(System.in);
     double temp = scanner.nextDouble();
     System.out.println("In F: " + convertToF(temp));

     scanner.close();
    }

    private static double convertToF(double temp) {
        return 32 + (9 * temp / 5);
    }
}

/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). */