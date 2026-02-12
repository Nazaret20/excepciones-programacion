import java.util.Arrays;

public class ExpandirArray {
    public static void main(String[] args) {
        //Dado un array, crea un nuevo array duplicando su tamaño, copiando los valores originales y rellenando los espacios restantes con la media de los elementos adyacentes, en el último elemento poner la suma de todos los elementos del array original. 
        //Por ejemplo: [0, 1, 2, 3] ---> [0, 0.5, 1, 1.5, 2, 2.5, 3, 6]

        int[] arr = {0, 1, 2, 3};
        double[] fn = expandir(arr);
        System.out.println(Arrays.toString(fn));

    }

    public static double[] expandir(int[] arr) {
        double[] expandido = new double[arr.length * 2];
        double temp = 0;
        int suma = 0;

        for (int i = 0; i < arr.length; i++) {
            expandido[i * 2] = arr[i];
            suma += arr[i];
        }
        expandido[expandido.length - 1] = suma;

        for (int i = 1; i < expandido.length - 1; i = i + 2) {
            expandido[i] = (expandido[i - 1] + expandido[i + 1]) / 2;
        }

        return expandido;
    }
}
