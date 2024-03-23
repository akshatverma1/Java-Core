public class arrayquestiontwo {
    public static void two(int nums[][]) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int u = 1;

            sum = sum + nums[u][i];
        }
        System.out.println(sum);
    }

    public static void main(String arr[]) {
        int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        two(nums);
    }
}
