import java.util.Scanner;

public class Ej11{

    public static void main(String[] args) throws Exception{
     Scanner scanner = new Scanner(System.in);
     double a = scanner.nextInt(), b = scanner.nextInt(); int opc;

     System.out.println("BIENVENIDO!");
     System.out.println("MENU");
     System.out.println("1- Sumar");
     System.out.println("2- Restar");
     System.out.println("3- Multiplicar");
     System.out.println("4- Dividir");
     System.out.println("5- Salir");
     
     do{
     System.out.println("Ingrese una opcion: ");
     opc = scanner.nextInt();
     switch(opc){
        case 1:{
            System.out.println(a+b);
            break;
        }
        case 2:{
            System.out.println(a-b);
            break;
        }
        case 3:{
            System.out.println(a*b);
            break;
        }
        case 4:{
            if(b!=0)
            System.out.println(a/b);
            else
            System.out.println("Error. Div 0");
        }
     }
     }while(opc != 5);
     scanner.close();
    }
}

/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú. */