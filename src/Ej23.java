import java.util.Scanner;

public class Ej23{

    public static void main(String[] args) throws Exception{
     Scanner scanner = new Scanner(System.in);

     System.out.println("Ingrese un número de 3 cifras: ");
     int num = scanner.nextInt();

     if(num<999 || num>100){

        if(centena == unidad){
            System.out.println("Capicua");
        }else{
            System.out.println("No capicua");
        }
        scanner.close();
     }
    }
}