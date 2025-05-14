package String;

public class Rotate_String {
    public static void main(String arr[]) {
        String s = "aa";
        String t = "a";
        System.out.println(reverse(s, t));
    }

    public static boolean reverse(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        String str = s + s;
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String str1 = str.substring(i, j);
                if (str1.equals(t)) {
                    return true;
                }
            }
        }
        return false;
    }
}
