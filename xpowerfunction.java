public class xpowerfunction {
    public static int poww(int x, int p) {
        if (p == 0) {
            return 1;
        }

        int y = poww(x, p - 1);
        int sum = y * x;
        return sum;
    }

    public static void main(String a[]) {
        System.out.println(poww(2, 10));
    }
}
