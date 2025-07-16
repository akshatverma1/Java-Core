public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String arr[]) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int result[] = new int[2];
        result[0] = searchRangeSecond(nums, target, 0, nums.length - 1);
        result[1] = searchRangethird(nums, target, 0, nums.length - 1);
        System.out.print(result[0] + " " + result[1]);
    }

    public static int searchRangeSecond(int[] nums, int target, int si, int ei) {
        int ans = -1;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (nums[mid] == target) {
                ans = mid;
                ei = mid - 1;
            } else if (target > nums[mid]) {
                return searchRangeSecond(nums, target, mid + 1, ei);
            } else {
                return searchRangeSecond(nums, target, si, mid - 1);
            }
        }
        return ans;
    }

    public static int searchRangethird(int[] nums, int target, int si, int ei) {
        int ans = -1;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (nums[mid] == target) {
                ans = mid;
                si = mid + 1;
            } else if (target > nums[mid]) {
                return searchRangethird(nums, target, mid + 1, ei);
            } else {
                return searchRangethird(nums, target, si, mid - 1);
            }
        }
        return ans;
    }
}
