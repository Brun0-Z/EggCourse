import java.util.Scanner;

public class Ej7{

    public static void main(String[] args) throws Exception{
     Scanner scanner = new Scanner(System.in);
     String frase = scanner.nextLine();
     scanner.close();
     System.out.println("¿Esta frase es eureka?: " + checkEu(frase));
    }

    private static boolean checkEu(String frase) {
        return frase.equals("eureka") ? true : false;
    }
}

/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java. */