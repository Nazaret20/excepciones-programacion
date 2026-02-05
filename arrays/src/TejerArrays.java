import java.util.Arrays;

public class TejerArrays {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3};
        int[] arr2 = {10, 11, 12, 13};

        int[] fn = tejerArrays(arr1, arr2);
        System.out.printf("Los arrays %s y %s, tejidos sería %s", Arrays.toString(arr1), Arrays.toString(arr2) ,Arrays.toString(fn));
    }

    public static int[] tejerArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return null;
        } 

        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[2 * i] = arr1[i];
            result[2 * i + 1] = arr2[i]; 
        }

        return result;
    }
}
