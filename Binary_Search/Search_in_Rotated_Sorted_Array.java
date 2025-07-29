public class Search_in_Rotated_Sorted_Array {
    public static void main(String arr[]) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int index = -1;
        int si = 0;
        int ei = nums.length - 1;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[si] <= nums[mid]) {
                if (nums[si] <= target && target <= nums[mid]) {
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[ei]) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
        }
        return index;
    }
}
