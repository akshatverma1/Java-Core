public class supportclass {
    public static int akshat(int x, int y) {
        if (y == 0) {
            return 1;
        }
        int f = akshat(x, y - 1);
        int total = f * x;
        return total;
    }

    public static void main(String arr[]) {
        System.out.println(akshat(2, 5));
    }
}
