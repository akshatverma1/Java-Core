import java.util.*;

public class Find_the_Smallest_Divisor_Given_a_Threshold {
    public static void main(String arr[]) {
        int nums[] = { 1, 2, 5, 9 };
        int threshold = 6;
        Arrays.sort(nums);
        System.out.println(smallestDivisor(nums, threshold));
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;

        for (int num : nums) {
            right = Math.max(right, num); // find the maximum value
        }

        int answer = right;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            int sum = 0;
            for (int num : nums) {
                sum += (num + mid - 1) / mid; // equivalent to Math.ceil(num / mid)
            }

            if (sum <= threshold) {
                answer = mid;
                right = mid - 1; // try to find smaller divisor
            } else {
                left = mid + 1; // need a bigger divisor
            }
            mid = left + (right - left) / 2;
        }

        return answer;
    }
}
