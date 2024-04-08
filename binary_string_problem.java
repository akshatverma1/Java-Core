public class binary_string_problem {
    public static void akshat(int n, int laststr, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        akshat(n - 1, 0, str + 0);
        if (laststr == 0) {
            akshat(n - 1, 1, str + 1);
        }
    }

    public static void main(String ar[]) {
        String str = "";
        akshat(2, 0, str);
    }
}
