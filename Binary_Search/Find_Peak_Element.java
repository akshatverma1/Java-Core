public class Find_Peak_Element {
    public static void main(String arr[]) {
        int nums[] = { 1, 2, 3, 1 };
        int ans = Integer.MIN_VALUE;
        System.out.println(findPeakElement(nums, 0, nums.length - 1, ans));
    }

    public static int findPeakElement(int[] nums, int si, int ei, int ans) {
        if (si == ei) {
            return si;
        }
        int mid = si + (ei - si) / 2;
        if (nums[mid] > nums[mid + 1]) {
            return findPeakElement(nums, si, mid, ans);
        } else {
            return findPeakElement(nums, mid + 1, ei, ans);
        }
    }
}
