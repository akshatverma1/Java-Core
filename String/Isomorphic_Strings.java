package String;

public class Isomorphic_Strings {
    public static void main(String arr[]) {
        String s = "egg";
        String t = "add";
        System.out.println(Isomorphic(s, t));
    }

    public static boolean Isomorphic(String s, String t) {
        if (s.length() != t.length()) {
            System.out.println("length false");
            return false;
        }
        StringBuilder str1 = new StringBuilder("");
        StringBuilder str2 = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            char sv = s.charAt(i);
            char tv = t.charAt(i);
            char temp = sv;
            sv = tv;
            tv = temp;
            str1.append(sv).toString();
            str2.append(tv).toString();
        }
        if (str1 == str2) {
            return true;
        }
        return false;
    }
}
