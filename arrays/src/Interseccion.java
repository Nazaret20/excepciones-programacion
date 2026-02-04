import java.util.Arrays;

public class Interseccion {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1};
        int[] arr2 = {1, 3};

        int[] fn = interseccion(arr1, arr2);
        System.out.printf("Los elementos comunes de %s y %s, son %s", Arrays.toString(arr1), Arrays.toString(arr2), Arrays.toString(fn));

    }

    public static int[] interseccion(int[] arr1, int[] arr2) {
        int tamano = arr1.length;
        if (arr2.length < tamano) {
            tamano = arr2.length;
        }

        int[] temp = new int[tamano];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    boolean existe = false;

                    for (int l = 0; l < k; l++) {
                        if (arr1[i] == temp[l]) {
                            existe = true;
                        }
                    }

                    if (!existe) {
                        temp[k] = arr1[i];
                        k++;
                    }

                    
                }
            }
        }

        if (k == temp.length) {
            return temp;
        } else {
            int[] result = new int[k];
            for (int i = 0; i < k; i++) {
                result[i] = temp[i];
            }
            return result;
        }
    }
}
