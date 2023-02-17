/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) throws Exception {
       Scanner read = new Scanner(System.in);
        int a = read.nextInt(), b=read.nextInt();
        
        System.out.println("Suma: "+sumar(a, b));
        read.close();
    }

    public static int sumar(int a, int b){
        return a+b;
    }
}
