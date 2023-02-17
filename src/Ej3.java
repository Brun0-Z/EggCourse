import java.util.Scanner;

public class Ej3{

    public static void main(String[] args) throws Exception{
     Scanner scanner = new Scanner(System.in);
     String frase = scanner.nextLine();
     System.out.println(frase.toUpperCase());
     System.out.println(frase.toLowerCase());
     scanner.close();  
    }
}

/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java. */