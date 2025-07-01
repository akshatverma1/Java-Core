import java.util.*;

public class Merge_Intervals {
    public static void main(String arr[]) {
        int intervalsarray[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        intervals(intervalsarray);
    }

    public static int[][] intervals(int[][] intervalsa) {
        Arrays.sort(intervalsa, (a, b) -> a[0] - b[0]);
        int start = intervalsa[0][0];
        int end = intervalsa[0][1];
        List<int[]> list = new ArrayList<>();
        for (int i = 1; i < intervalsa.length; i++) {
            int s = intervalsa[i][0];
            int e = intervalsa[i][1];
            if (s <= end) {
                end = Math.max(e, end);
            } else {
                list.add(new int[] { start, end });
                start = s;
                end = e;
            }

        }
        list.add(new int[] { start, end });
        return list.toArray(new int[list.size()][]);
    }
}
