public class subset {
    public static void subsett(String s, String empty, int i, int count) {
        // base case
        if (i == s.length()) {
            System.out.println(empty);
            count++;
            return;
        }
        // For Yes
        subsett(s, empty + s.charAt(i), i + 1, count);
        // For No
        subsett(s, empty, i + 1, count);
    }

    public static void main(String a[]) {
        int count = 0;
        subsett("abc", "", 0, count);
        System.out.println(count);
    }
}