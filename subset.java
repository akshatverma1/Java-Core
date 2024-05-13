public class subset {
    public static void subsett(String s, String empty, int i) {
        // base case
        if (i == s.length()) {
            System.out.println(empty);

            return;
        }
        // For Yes
        subsett(s, empty + s.charAt(i), i + 1);
        // For No
        subsett(s, empty, i + 1);

    }

    public static void main(String a[]) {
        subsett("abc", "", 0);
    }
}