public class fab {
    public static int akshat(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        int x = akshat(n - 1);
        System.out.println(n);
        return 0;
    }

    public static void main(String[] args) {
        akshat(5);
    }
}
