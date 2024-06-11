import java.util.ArrayList;
import java.util.*;

public class two_pointer {
    public static int container(ArrayList<Integer> height) {
        int max = 0;
        int left = 0;
        int right = height.size() - 1;
        while (left < right) {
            int width = right - left;
            int heightt = Math.min(height.get(right), height.get(left));
            int area = width * heightt;
            max = Math.max(max, area);
            if (left < right) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    public static void main(String arr[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(height);
        System.out.println(container(height));

    }
}
