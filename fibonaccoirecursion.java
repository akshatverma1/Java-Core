public class fibonaccoirecursion {
    public static void smaple() {
        System.out.println("Sample function invoked");
    }

    public static int fibona(int n) {
        if (n <= 1) {
            return 0;
        }
        int x = fibona(n - 1);
        smaple();
        System.out.println(x);
        return 7;
    }

    public static void main(String[] args) {
        fibona(5);
    }
}
