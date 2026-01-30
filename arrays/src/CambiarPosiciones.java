import java.util.Arrays;

public class CambiarPosiciones {
    public static void main(String[] args) {
        int[] nums = {10, 11, 12, 13};
        int[] posiciones = {3, 0, 2, 1};

        int[] fnCambiar = cambiarPos(nums, posiciones);

        if (fnCambiar != null) {
            System.out.printf("El array %s con las nuevas posiciones de %s, será %s.", Arrays.toString(nums), Arrays.toString(posiciones), Arrays.toString(fnCambiar));
        } else {
            System.err.println("Había un error de entrada en los arrays.");
        }
        
    }

    public static int[] cambiarPos(int[] nums, int[] posiciones) {
        if (nums.length != posiciones.length) {
            return null;
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < posiciones.length; i++) {
            if (posiciones[i] >= posiciones.length) {
                return null;
            }

            for (int j = i + 1; j < posiciones.length - 1; j++) {
                if (posiciones[i] == posiciones[j]) {
                    return null;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            result[posiciones[i]] = nums[i];
        }
        

        return result;
    }
}
