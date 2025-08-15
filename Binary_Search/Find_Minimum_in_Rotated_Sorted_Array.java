public class Find_Minimum_in_Rotated_Sorted_Array {
    // public static void main(String arr[]) {
    // int[] nums = { 2, 1 };
    // System.out.println(findMin(nums));
    // }

    public static int findMin(int[] nums) {
        int result = 0;
        int si = 0;
        int ei = nums.length - 1;
        int mid = si + (ei - si) / 2;
        while (si < ei) {

            if (nums[si] > nums[ei]) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
            mid = si + (ei - si) / 2;
        }
        return nums[mid];
    }
}
