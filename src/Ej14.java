import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) throws Exception{
     Scanner scanner = new Scanner(System.in);
     double euros = scanner.nextDouble();
     String conv = scanner.next();

     convertir(euros,conv);
     scanner.close();
    }

    private static void convertir(double euros, String conv) {
        if(conv.equals("D")) System.out.println("En dólares: " + euros*1.28611);
        if(conv.equals("L")) System.out.println("En libras: " + euros*0.86);
        if(conv.equals("Y")) System.out.println("En yenes: " + euros*129.852);
    }
}

/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */