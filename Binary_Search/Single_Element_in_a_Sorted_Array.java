import java.util.*;

public class Single_Element_in_a_Sorted_Array {
    public static void main(String arr[]) {
        int nums[] = { 3, 3, 7, 7, 10, 11, 11 };
        System.out.println(single(nums, 0, nums.length - 1));
    }

    public static int single(int nums[], int si, int ei) {
        if (nums.length == 1) {
            return nums[0];
        }

        // if (si <= ei) {
        //     int mid = si + (ei - si) / 2;
        //     if (mid == 0 && nums[mid] != nums[mid + 1])
        //         return nums[mid];
        //     if (mid == nums.length - 1 && nums[nums.length - 1] != nums[nums.length - 2])
        //         return nums[mid];
        //     if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
        //         return nums[mid];
        //     } else if (mid % 2 == 0) {
                if (nums[mid - 1] == nums[mid]) {
                    return single(nums, si, mid - 1);
                } else {
                    return single(nums, mid + 1, ei);
                }
            } else {
                if (nums[mid - 1] == nums[mid]) {
                    return single(nums, mid + 1, ei);
                } else {
                    return single(nums, si, mid - 1);
                }
            }
        }return 1;}}
