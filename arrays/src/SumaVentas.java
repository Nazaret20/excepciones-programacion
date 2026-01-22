public class SumaVentas
 {
    public static void main(String[] args) throws Exception {
        //int[] nums = new int[4]
        int[] nums = {10, 10, 20, 20};
        int suma = 0;

        for (int i = 0; i < nums.length; i++) {
            suma += nums[i];
        }
        
        System.out.println(suma);
    }
}
