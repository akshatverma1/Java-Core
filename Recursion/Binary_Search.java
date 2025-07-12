package Recursion;

public class Binary_Search {
    public static void main(String arr[]) {
        int nums[] = { -1, 0, 3, 5, 9, 12 };
        System.out.println(search(nums, 9));
    }

    public static int search(int[] nums, int target) {
        return search_second(nums, target, 0, nums.length - 1);
    }

    public static int search_second(int[] nums, int target, int si, int ei) {
        if (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target >= nums[mid]) {
                return search_second(nums, target, mid + 1, ei);
            } else {
                return search_second(nums, target, si, mid - 1);
            }
        }
        return -1;
    }
}
