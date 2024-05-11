public class floorsquart {
    public static int floorsquartt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int i = 1;
        int result = 1;
        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }

    public static void main(String a[]) {
        int x = 11;
        System.out.println(floorsquartt(x));
    }
}