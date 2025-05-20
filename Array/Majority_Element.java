import java.util.*;

public class Majority_Element {
    public static void main(String arr[]) {
        int array[] = { 1, 2, 3, 4, 5, 6, 1, 1, 3, 1, 7, 7, 7, 7, 7, 7 };
        System.out.println(majorityelement(array));
    }

    public static int majorityelement(int[] arr) {
        int max = 0, finalk = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int value : arr) {
            hm.put(value, 0);
        }
        for (int i : arr) {
            if (hm.get(i) >= 0) {
                int u = hm.get(i);
                hm.put(i, u + 1);
            }

            if (hm.get(i) > max) {
                max = hm.get(i);
            }
            if (hm.get(i) == max) {
                finalk = i;
            }
        }
        Set<Integer> Keys = hm.keySet();
        int r = 0;
        for (int value : Keys) {
            if (hm.get(value) == 0) {
                r++;
            }
            if (hm.size() == r) {
                List<Integer> n = new ArrayList<>();
                for (int y : Keys) {
                    n.add(y);
                }
            }

        }
        System.out.println(hm);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(finalk);
        return finalk;
    }
}
