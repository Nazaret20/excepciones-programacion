import java.util.Arrays;

public class Comparar {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4 };
        int[] array2 = { 1, 2, 3, 5 };

        boolean comparacion = compararArray(array1, array2);

        System.out.printf("La comparación de %s y %s, es %s", Arrays.toString(array1), Arrays.toString(array2), (comparacion) ? "igual" : "diferente");

    }

    public static boolean compararArray(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }

        }
        return true;
    }
}
