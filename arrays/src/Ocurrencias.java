import java.util.Arrays;
import java.util.Scanner;

public class Ocurrencias {
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
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int[] numeros = pedirArrayInt(sc);
       System.out.print("Dime el número a buscar: ");
       int numBuscar = Integer.parseInt(sc.nextLine());
       int contador = 0;

       for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numBuscar) {
                contador++;
            }
       }

       System.out.printf("El número %d aparece %d veces en la lista dada '%s'.", numBuscar, contador, Arrays.toString(numeros));
       sc.close();
    }
    
}
