import java.util.*;

public class Find_the_Smallest_Divisor_Given_a_Threshold {
    public static void main(String arr[]) {
        int nums[] = { 1, 2, 5, 9 };
        int threshold = 6;
        Arrays.sort(nums);
        System.out.println(smallestDivisor(nums, threshold));
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        return smallestDivisorSecond(nums, threshold, nums[0], nums[nums.length - 1]);
    }

    public static int smallestDivisorSecond(int nums[], int threshold, int sv, int ev) {
        int mid = sv + (ev - sv) / 2;
        int ans = mid;
        int result = Integer.MAX_VALUE;
        // while (sv <= ev) {
        //     int sum = 0;
        //     for (int i = 0; i < nums.length; i++) {
        //         int d = nums[i] / mid;
        //         if (d < 1) {
        //             d = 1;
        //         }
        //         sum = sum + d;
        //     }
            if (sum <= threshold) {
                sv = mid + 1;
                if (sum <= result) {
                    result = sum;
                    ans = mid;
                }
            } else {
                ev = mid - 1;
            }
            mid = sv + (ev - sv) / 2;
        }return ans;
}}
