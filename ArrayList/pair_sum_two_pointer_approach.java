import java.util.ArrayList;
import java.util.*;

public class pair_sum_two_pointer_approach {
    public static boolean pointer(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            if ((list.get(right) + list.get(left)) == target) {
                return true;
            }
            if ((list.get(right) + list.get(left)) < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pointer(list, 5));
    }
}