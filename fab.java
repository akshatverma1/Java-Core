public class fab {
    public static int akshat(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int x = akshat(n - 1);
        int y = akshat(n - 2);
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(akshat(5));
    }
}
