import java.util.Arrays;

public class ParesImpares {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        int[] pares, impares, ordenado = new int[nums.length];
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] %2 == 0) {
                ordenado[j] = nums[i];
                j++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] %2 != 0) {
                ordenado[j] = nums[i];
                j++;
            }
        }
       
        System.out.printf("El array %s , ordenado es %s", Arrays.toString(nums), Arrays.toString(ordenado));

    }
}
