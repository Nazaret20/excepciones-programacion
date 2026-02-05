import java.util.Arrays;

public class SumaParImp {
    public static void main(String[] args) {
        //Escribe un programa que recorra un array de enteros y calcule la suma de los números pares y la suma de los impares por separado.

        int[] arr1 = {1, 2, 3, 4, 5, 6};

        int[] fn = sumaParImp(arr1);

        int pares = fn[0];
        int impares = fn[1];

        System.out.printf("Para el array %s, la suma de pares es %s y la de impares es %s", Arrays.toString(arr1), pares, impares );
    }

    public static int[] sumaParImp(int[] arr1) {
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                pares += arr1[i];
            }

            if (arr1[i] % 2 != 0) {
                impares += arr1[i];   
            }
        }

        int[] valores = new int[2];
        valores[0] = pares;
        valores[1] = impares;

        return valores;
        
    }
    
}
