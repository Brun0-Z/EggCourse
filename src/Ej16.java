import java.util.Scanner;

public class Ej16{

    public static void main(String[] args) throws Exception{
    Scanner scanner = new Scanner(System.in); 
    int N = scanner.nextInt(); 
    
    
    int[] v = new int[N];
    for (int i = 0; i < v.length; i++) {
        v[i] = (int)(Math.random() * 10);
        System.out.print(v[i] + " ");
    }
    int L;
    do{
        L = scanner.nextInt();
    }while (L % 1 != 0);
    int cont = 0;
    for (int i = 0; i < v.length; i++) {
        if(v[i] == L){
            System.out.println("Founded in pos "+i);
            cont++;
        }
    }
    if (cont > 1 ){
        System.out.println("Repeated " + cont + " times");
    }
    scanner.close();
    }
}

/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido */