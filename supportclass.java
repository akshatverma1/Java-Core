public class supportclass {
    public static int akshat(int x, int y) {
        if (y == 0) {
            return 1;
        }
        int f = akshat(x, y - 1);
        int total = f * x;
        return total;
    }

    public static int friendspairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int single = friendspairing(n - 1);
        int pair = (n - 1) * friendspairing(n - 2);
        int totall = single + pair;
        return totall;
    }

    public static void main(String arr[]) {
        // System.out.println(akshat(2, 5));
        // System.out.println(friendspairing(4));
    }
}
