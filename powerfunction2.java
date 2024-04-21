public class powerfunction2 {
    public static int power2(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpowerfunction = power2(a, n / 2) * power2(a, n / 2);
        if (n % 2 != 0) {
            return halfpowerfunction * a;
        }
        return halfpowerfunction;
    }

    public static void main(String a[]) {
        System.out.println(power2(2, 4));
    }
}
