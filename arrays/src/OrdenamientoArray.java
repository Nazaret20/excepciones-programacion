import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OrdenamientoArray {
    public static void main(String[] args) {
        //Desarrolla un programa que genere un array de tamaño n (ingresado por el usuario) con números enteros aleatorios únicos (sin que se repitan) y luego lo ordene.
        Scanner sc = new Scanner(System.in);
        int[] nums = generarAleat(sc);

        System.out.printf("El array %s ordenado es %s", Arrays.toString(nums), Arrays.toString(ordenar(nums)));

        
    }

    public static int[] ordenar(int[] arr1) {
        boolean cambio;
        do {
            cambio = false;
            for (int i = 0; i < arr1.length - 1; i++) {
                if (arr1[i] > arr1[i + 1]) {
                    int tmp = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = tmp;
                    cambio = true;
                }
            }
        } while (cambio);

        
        return arr1;
    }

    public static int[] generarAleat(Scanner sc) {
        System.out.print("Dime de cuántos números quieres el array: ");
        int numDatos = Integer.parseInt(sc.nextLine());
        System.out.print("Dime el máximo del rango: ");
        int rango = Integer.parseInt(sc.nextLine());

        Random random = new Random();
        int[] arr1 = new int[numDatos];

        for (int i = 0; i < arr1.length; i++) {
            int nuevoNum;

            do {
                nuevoNum = random.nextInt(rango);
            } while (isIn(arr1, nuevoNum));
            arr1[i] = nuevoNum;
            
        }
        
        return arr1;
    }  

    public static boolean isIn(int[] arr1, int num) {
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == num) {
                return true;
            } 
        }
        return false;
    }
}
