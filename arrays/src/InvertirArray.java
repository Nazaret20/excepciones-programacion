import java.util.Arrays;
import java.util.Scanner;

public class InvertirArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = pedirArrayInt(sc);

        int[] inverso = invertirArray(array);

        System.out.printf("El array inverso de %s es %s", Arrays.toString(array), Arrays.toString(inverso));
        

        sc.close();
    }

    public static int[] invertirArray(int[] array) {
        int[] invertido = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }

        return invertido;
    }

    public static int[] pedirArrayInt(Scanner sc) {
        System.out.print("Dime el número de datos que me vas dar: ");
        int numDatos = Integer.parseInt(sc.nextLine());

        int[] numeros = new int[numDatos];
        for(int i = 0; i < numDatos; i++) {
            System.out.print("Dime el número " + (i+1) + ": ");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }
        return numeros;
    }  
}
