import java.util.Arrays;

public class IntercambioMitad {
    public static void main(String[] args) {
        //Divide un array en dos mitades y crea un nuevo array en el que las posiciones de ambas mitades se intercambien.
        int[] arr1 = {1, 2, 3, 4, 5, 6};

        int[] fn = dividir(arr1);

        System.out.println(Arrays.toString(fn));

    }

    public static int[] dividir(int[] arr1) {
        int mitad = arr1.length / 2;
        int[] mitad1 = new int[mitad];
        int[] mitad2 = new int[mitad];
        
        
        for (int i = 0; i < mitad; i++) {
            mitad1[i] = arr1[i];
        }

        for (int i = 0; i < mitad; i++) {
            mitad2[i] = arr1[i + mitad];
        }
        
        int[] result = new int[arr1.length];
        
        for (int i = 0; i < mitad; i++) {
            result[i] = mitad2[i];
        }

        for (int i = 0; i < mitad; i++) {
            result[i + mitad] = mitad1[i];
        }

        return result;
    }
}
