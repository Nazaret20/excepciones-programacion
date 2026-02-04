import java.util.Arrays;

public class ArrayAsc {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 6, 5};

        System.out.printf("El array %s %s está ordenado de forma ascendente.", Arrays.toString(arr1), (arrayAsc(arr1)) ? "sí" : "no");
    }

    public static boolean arrayAsc(int[] arr1) {
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] > arr1[i + 1]) {
                return false;
            }
        }
        return false;
    }
}
