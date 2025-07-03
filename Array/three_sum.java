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
            for (int o = i + 1; o < nums.length; o++) {
                int y = nums[i] + nums[j] + nums[k];
                if (y == 0) {
                    count++;
                    List<Integer> innerlist = new ArrayList<>();
                    innerlist.add(nums[i]);
                    innerlist.add(nums[j]);
                    innerlist.add(nums[k]);
                    outerlist.add(innerlist);
                    break;
                }
                if (y < 0) {
                    j++;
                } else {
                    k--;
                }
                if (j >= k) {
                    break;
                }
            }
        }
        System.out.println(count);
        System.out.println(outerlist);
        return nums;
    }
}
