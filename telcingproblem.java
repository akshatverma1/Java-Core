public class telcingproblem {
    public static int ways(int n) {
        if ((n == 0) || (n == 1)) {
            return 1;
        }
        int x = ways(n - 1);
        int y = ways(n - 2);
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(ways(5));
    }
}
