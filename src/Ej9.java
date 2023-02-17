import java.util.Scanner;

public class Ej9{

    public static void main(String[] args) throws Exception{
     Scanner scanner = new Scanner(System.in);
     String frase = scanner.nextLine();
     checkA(frase);
     scanner.close();
    }

    private static void checkA(String frase) {
        if(frase.substring(0,1).equals("A")){
            System.out.println("Correct");
        }else{
            System.out.println("Error");
        }
    }
    
}

/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java. */