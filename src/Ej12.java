import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cad; int contT = 0, contF = 0;

        do{
            cad = scanner.nextLine();
            if(cad.length() == 5){
                if(cad.substring(0,1).equals("X") && cad.substring(4,5).equals("0")) contT++;
                 else contF++;
            }
        }while(!cad.equals("&&&&&"));
        System.out.println("Cantidad de cadenas correctas: " + contT);
        System.out.println("Cantidad de cadenas incorrectas: " + contF);
        scanner.close();
    }
}

/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals(). */