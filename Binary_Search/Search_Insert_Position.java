public class Search_Insert_Position {
    public static void main(String arr[]) {
        int nums[] = { 1 };
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        return searchInsert_second(nums, target, 0, nums.length - 1);
    }

    public static int searchInsert_second(int[] nums, int target, int si, int ei) {
        if (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (nums[mid] <= target) {
                return searchInsert_second(nums, target, mid + 1, ei);
            } else {
                return searchInsert_second(nums, target, si, mid - 1);
            }
        }

        return search_third(nums, 0, target);
    }

    public static int search_third(int nums[], int n, int target) {
        if (n == nums.length) {
            return nums.length;
        } else if (target < nums[n]) {
            return n;
        } else {
            return search_third(nums, n + 1, target);
        }
    }
}