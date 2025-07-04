import java.util.*;

public class three_sum {
    public static void main(String arr[]) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        three_sum(nums);
    }

    public static int[] three_sum(int nums[]) {
        Arrays.sort(nums);
        int count = 0;
        List<List<Integer>> outerlist = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (i > 0 && nums[i] == nums[i - 1])
                    continue;
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> innerlist = new ArrayList<>();
                    innerlist.add(nums[i]);
                    innerlist.add(nums[j]);
                    innerlist.add(nums[k]);
                    outerlist.add(innerlist);
                    k--;
                    j++;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    ;
                }
            }
        }
        System.out.println(count);
        System.out.println(outerlist);
        return nums;
    }
}
