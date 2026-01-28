import java.util.Arrays;
import java.util.Scanner;

public class FusionarArrays {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Primer array ---");
        int[] array1 = pedirArrayInt(sc);
        System.out.println("--- Segundo array ---");
        int[] array2 = pedirArrayInt(sc);

        int[] fusionado = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            fusionado[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            fusionado[array1.length + i] = array2[i];
        }
        System.out.printf("El array %s y el array %s, fusionados serán %s.",
            Arrays.toString(array1), Arrays.toString(array2), Arrays.toString(fusionado)
        );
        sc.close();
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
