public class permutation {
    public static void combination(String newstr, String ans) {
        // base case
        if (0 == newstr.length()) {
            System.out.println(ans);
            return;
        }
        // Resurtion
        for (int i = 0; i < newstr.length(); i++) {
            char current = newstr.charAt(i);
            // abcde = ab + de;
            String delectstr = newstr.substring(0, i) + newstr.substring(i + 1);
            combination(delectstr, ans + current);
        }
    }

    public static void main(String arr[]) {
        String str = "abc";
        combination(str, "");
    }
}