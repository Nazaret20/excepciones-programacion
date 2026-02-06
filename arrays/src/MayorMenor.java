import java.util.Arrays;

public class MayorMenor {
    public static void main(String[] args) {
        //Escribe un programa que recorra un array de enteros y calcule la suma de los números pares y la suma de los impares por separado.

        int[] arr1 = {1, 4, 6, 3, 7, 9};

        int[] fn = mayorMenor(arr1);
        System.out.printf("El array %s intercambiado es %s",Arrays.toString(arr1), Arrays.toString(fn));
    }

    public static int[] mayorMenor(int[] arr1) {
        int[] result = new int[arr1.length];
        int posMax = 0, posMin = 0;
        int max = arr1[0], min = arr1[1];

        for (int i = 1; i < arr1.length; i++) {
            if (max < arr1[i]) {
                max = arr1[i];
                posMax = i;
            }

            if (min > arr1[i]) {
                min = arr1[i];
                posMin = i;
            }
            
        }

        arr1[posMax] = max;
        arr1[posMin] = min;


        return result;
    }
}
