import java.util.*;

public class Find_the_Duplicate_Number {

    public static void main(String arr[]) {
        int nums[] = { 1, 3, 4, 2, 2 };
        System.out.println(Duplicate(nums));
    }

    public static int Duplicate(int nums[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                return nums[i];
            } else {
                hm.put(nums[i], 1);
            }
        }


        //Is Time complexicity is O(n^2)
        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[i] == nums[j]) {
        // return nums[i];
        // }
        // }
        // }
        // return count;
        return -1;
    }
}
