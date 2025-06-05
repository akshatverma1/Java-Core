public class Maximum_Product_Subarray {
    public static void main(String arr[]) {
        int nums[] = { 2, 3, -2, 4 };
        System.out.println(maximum(nums));
    }

    public static int maximum(int[] nums) {
        int product = 1;
        int u = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = i; k <= j; k++) {
                    product *= nums[k];
                }
                if (product > u) {
                    u = product;
                }
                product = 1;
            }
        }
        return u;
    }
}