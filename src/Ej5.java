import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();;
        double b,c,d;
        b = Math.sqrt(a);
        c = Math.pow(a,2);
        d = Math.pow(a, 3);
        System.out.println("Raiz: " + b + ", Cuadrado: " + c + ", Cubo: " + d);
        scanner.close();
    }
}
/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt(). */