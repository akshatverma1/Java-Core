import java.util.*;

public class factorialusingrecursion {
    public static int factroial(int n) {
        if (n == 0) {
            return 1;
        }
        int y = factroial(n - 1);
        int total = n * y;
        return total;
    }

    public static void main(String arr[]) {
        int n = 5;
        System.out.println(factroial(n));
    }
}
