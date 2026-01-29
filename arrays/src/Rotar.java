import java.util.Arrays;

public class Rotar {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3};
        int posiciones = 1;
        boolean sentido = false;

        int[] rotado = rotarArray(array, posiciones, sentido);

        System.out.printf("El array %s, rotado %d posiciones a la %s es %s", Arrays.toString(array), posiciones, (sentido) ? "derecha" : "izquierda", Arrays.toString(rotado));
    }

    //sentido = true (dcha)
    //sentido = false (izq)
    public static int[] rotarArray(int [] array, int posiciones, boolean sentido) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            
            if (sentido) { //derecha
                if (i + posiciones < array.length) { //si están en rango
                    result[i + posiciones] = array[i];
                } else { //si se salen
                    result[i + posiciones - array.length] = array[i];
                }
    
            } else { //izquierda
                if (i - posiciones >= 0) { //si están en rango
                    result[i - posiciones] = array[i];
                } else { //si se salen
                    result[i - posiciones + array.length] = array[i];
                }
    
            }
        }

        return result;
    }
}
