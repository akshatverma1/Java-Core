import java.util.*;

public class rotated_arrayList {
    public static boolean container(ArrayList<Integer> height, int target) {
        int left;
        int right;
        int brakpoint = 0;
        int n = height.size();
        for (int i = 0; i < height.size(); i++) {
            if (height.get(i) > height.get(i + 1)) {
                brakpoint = i;
                break;
            }
        }
        left = brakpoint + 1;
        right = brakpoint;
        System.out.println(left);
        while (left != right) {
            if ((height.get(left) + height.get(right)) == target) {
                return true;
            }
            if ((height.get(left) + height.get(right)) < target) {
                left = (left + 1) % n;
            } else {
                right = (n + right - 1) % n;
            }
        }
        return false;
    }

    public static void main(String arr[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(11);
        height.add(15);
        height.add(6);
        height.add(7);
        height.add(8);
        height.add(9);
        height.add(10);
        System.out.println(height);
        System.out.println(container(height, 200));
    }
}
