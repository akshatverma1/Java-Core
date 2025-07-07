import java.util.*;

public class four_sum {
    public static void main(String arr[]) {
        int nums[] = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        System.out.println(four(nums, target));
    }

    public static List<List<Integer>> four(int[] nums, int target) {
        List<List<Integer>> outerlist = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length;) {
            for (int j = i + 1; j < nums.length;) {
                int p = j + 1;
                int q = nums.length - 1;
                while (p < q) {
                    long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];
                    if (sum < target) {
                        p++;
                    } else if (sum > target) {
                        q--;
                    } else {
                        List<Integer> innerlist = new ArrayList<>();
                        innerlist.add(nums[i]);
                        innerlist.add(nums[j]);
                        innerlist.add(nums[p]);
                        innerlist.add(nums[q]);
                        outerlist.add(innerlist);
                        p++;
                        q--;
                        // while (p < q && nums[p] == nums[p - 1])
                        // p++;
                        // while (p < q && nums[q] == nums[q + 1])
                        // q--;
                    }

                }
                j++;
                while (j < nums.length && nums[j] == nums[j - 1]) {
                    j++;
                }
            }
            i++;
            while (i < nums.length && nums[i] == nums[i - 1]) {
                i++;
            }
        }
        return outerlist;
    }
}