import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ConversionTipos {
    public static void main(String[] args) {
        //Crea un método que convierta un array de enteros (del 0 al 10) en un array de Strings, donde cada entero se represente en forma textual. Por ejemplo: [1, 4] sería ["uno", "cuatro"]
        Scanner sc = new Scanner(System.in);

        int[] fnAleat = aleat(sc);
        String[] fnConversion = conversion(fnAleat);
        System.out.println(Arrays.toString(fnConversion));

        sc.close();
    }

    public static String[] conversion(int[] array) { 
        String[] result = new String[array.length];   
        String[] palabras = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < palabras.length; j++) {
                switch (array[i]) {
                    case 1:
                        if (array[i] == 1) {
                            result[i] = palabras[j];
                        }
                        break;

                    case 2:
                        if (array[i] == 2) {
                            result[i] = palabras[j];
                        }
                        break;
                    case 3:
                        if (array[i] == 3) {
                            result[i] = palabras[j];
                        }
                        break;
                    case 4:
                        if (array[i] == 4) {
                            result[i] = palabras[j];
                        }
                        break;
                    case 5:
                        if (array[i] == 5) {
                            result[i] = palabras[j];
                        }
                        break;
                    case 6:
                        if (array[i] == 6) {
                            result[i] = palabras[j];
                        }
                        break;
                    case 7:
                        if (array[i] == 7) {
                            result[i] = palabras[j];
                        }
                        break;
                    case 8:
                        if (array[i] == 8) {
                            result[i] = palabras[j];
                        }
                        break;
                    case 9:
                        if (array[i] == 9) {
                            result[i] = palabras[j];
                        }
                        break;
                    case 10:
                        if (array[i] == 10) {
                            result[i] = palabras[j];
                        }
                        break;


                
                    default:
                        break;
                }
                
            }
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
