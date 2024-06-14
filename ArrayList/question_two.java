import java.util.ArrayList;
import java.util.*;

public class question_two {
    public static int maxcount(ArrayList<Integer> list, int target) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int u = 0; u <= i; u++) {

            }
        }
        return count;
    }

    public static void main(String arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(6);
        list.add(5);
        list.add(1);
        list.add(8);
        list.add(1);
        System.out.println(list);
        System.out.println(maxcount(list, 1));
    }
}
