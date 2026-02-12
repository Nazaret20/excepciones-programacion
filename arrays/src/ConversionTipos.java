import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ConversionTipos {
    public static void main(String[] args) {
        //Crea un método que convierta un array de enteros (del 0 al 10) en un array de Strings, donde cada entero se represente en forma textual. Por ejemplo: [1, 4] sería ["uno", "cuatro"]
        Scanner sc = new Scanner(System.in);

        int[] fnAleat = aleat(sc);
        String[] fnConversion = conversion(fnAleat);
        System.out.printf("El array de números %s, en palabras es %s", Arrays.toString(fnAleat), Arrays.toString(fnConversion));


        sc.close();
    }

    public static String[] conversion(int[] array) { 
        String[] result = new String[array.length];   
        String[] palabras = {"cero" ,"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};

        for (int i = 0; i < array.length; i++) {
            result[i] = palabras[array[i]];
        }

        return result;

    }

    public static int[] aleat(Scanner sc) {
        System.out.print("De cuántos números quieres el array (1-10): ");
        int rango = Integer.parseInt(sc.nextLine());
        int[] array = new int[rango];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int numAleat = random.nextInt(10);
            array[i] = numAleat;
        }

        return array;
    }
}
