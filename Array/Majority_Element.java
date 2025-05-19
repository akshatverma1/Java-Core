import java.util.*;

public class Majority_Element {
    public static void main(String arr[]) {
        int array[] = { 1, 2, 3, 4, 5, 6, 1, 1, 3, 1 };
        majorityelement(array);
    }

    public static int[] majorityelement(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int value : arr) {
            hm.put(value, value);
        }
        System.out.println(hm);
        return arr;
    }
}
