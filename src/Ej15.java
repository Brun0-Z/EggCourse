public class Ej15{

    public static void main(String[] args) throws Exception{
    int vec[] = new int[100];
     fillVector(vec);
    }

    private static void fillVector(int[] vect) {
        for (int i = 0; i < vect.length; i++) {
            vect[i] = i;
            System.out.println(vect[i]);
        }

    }
}

/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente. */