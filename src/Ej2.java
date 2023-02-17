import java.util.Scanner;

/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla. */

public class Ej2 {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.nextLine();

        System.out.println("Tu nombre es " + nom);
        scanner.close();
    }

}