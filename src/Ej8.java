import java.util.Scanner;

public class Ej8{

    public static void main(String[] args) throws Exception{
     Scanner scanner = new Scanner(System.in);
     String frase = scanner.nextLine();
     if (frase.length() != 8){
        System.out.println("Invalid");
     }else{
        System.out.println("OK");
     }
     scanner.close();
    }


}

/*Realizar un programa que solo permita introducir frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Length() en Java. */