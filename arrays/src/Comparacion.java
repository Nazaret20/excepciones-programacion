import java.util.Arrays;

public class Comparacion {
    public static void main(String[] args) {
        //Verifica si dos arrays contienen los mismos elementos, independientemente del orden en el que aparecen.

        int[] arr1 = {2, 4, 1, 8};
        int[] arr2 = {8, 1, 5, 4};

        boolean fn = comparacion(arr1, arr2);

        System.out.printf("Los arrays %s y %s %s contienen los mismos elementos", Arrays.toString(arr1), Arrays.toString(arr2), (fn) ? "" : "no");
    }

    public static boolean comparacion(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        } 
        
        for (int i = 0; i < arr1.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    encontrado = true;;
                }
            }

            if (!encontrado) {
                return false;
            }
        }

        return true;
    }
}
