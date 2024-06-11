import java.util.ArrayList;
import java.util.*;

public class container_with_most_water {
    public static int container(ArrayList<Integer> height) {
        int max = 0;

        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int width = j - i;
                int heightt;
                heightt = Math.min(height.get(i), height.get(j));
                int area = width * heightt;
                max = Math.max(max, area);
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
        System.out.println(container(height));
        System.out.println(height);
    }
}
