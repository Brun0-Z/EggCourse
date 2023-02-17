public class Ej17{

    public static void main(String[] args) throws Exception{
     int n[] = new int[20];
     int c1=0,c2=0,c3=0,c4=0,c5=0;

     for (int i = 0; i < n.length; i++)  n[i] = (int)(Math.random()*100000);

     for (int i = 0; i < n.length; i++) System.out.print(n[i] + " ");

     for (int i = 0; i < n.length; i++) {
        switch(contarDig(n[i])){
            case 1:{
                c1++;
                break;
            }
            case 2:{
                c2++;
                break;
            }
            case 3:{
                c3++;
                break;
            }
            case 4:{
                c4++;
                break;
            }
            case 5:{
                c5++;
                break;
            }
        }
     }
     System.out.println("Numbers with 1 digit: " + c1);
     System.out.println("Numbers with 2 digit: " + c2);
     System.out.println("Numbers with 3 digit: " + c3);
     System.out.println("Numbers with 4 digit: " + c4);
     System.out.println("Numbers with 5 digit: " + c5);
    }

    private static int contarDig(int i) {
        int cont = 0;
        while (i > 0) {
            i = i / 10;
            cont++;
        }
        return cont;
    }
}

/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos). */