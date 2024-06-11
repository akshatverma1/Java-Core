import java.util.ArrayList;
import java.util.*;

public class pair_sum {
    public static boolean summ(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if ((list.get(i) + list.get(j)) == target) {
                    return true;
                }
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
        System.out.println(summ(list, 90));
    }
}
