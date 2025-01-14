import java.lang.reflect.Array;
import java.util.*;

public class maximum_sub_array {
    public static void main(String arr[]) {
        int arrayyy[] = { -1, 0, 1, 2, -1, -4 };
        int width = 3;
        int loopEnd = arrayyy.length - width;
        int target = 0;
        System.out.println(Max(arrayyy, width, loopEnd, target));

    }

    public static int Max(int arrayyy[], int width, int loopEnd, int target) {
        List<List<Integer>> Lists = new ArrayList<>();
        int maxnum = 0;
        for (int i = 0; i <= loopEnd; i++) {
            if ((arrayyy[i] + arrayyy[i + 1] + arrayyy[i + 2]) == target) {
                System.out.println("Printed");
                Lists.add(Arrays.asList(arrayyy[i], arrayyy[i + 1], arrayyy[i + 2]));
                System.out.println(Lists);
            }
        }
        return 0;
    }
}