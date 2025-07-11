package Recursion;

public class Check_if_array_is_sorted {
    public static void main(String arr[]) {
        int nums[] = { 1, 2, 3, 6, 5 };
        int n = nums.length;
        System.out.print(check(nums, n));
    }

    public static boolean check(int nums[], int n) {
        if (n == 0 || n == 1) {
            return true;
        }
        return nums[n - 1] >= nums[n - 2] && check(nums, n - 1);
    }
}
