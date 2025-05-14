package String;

import java.util.*;

public class Isomorphic_Strings {
    public static void main(String arr[]) {
        String s = "egg";
        String t = "add";
        System.out.println(Isomorphic(s, t));
    }

    public static boolean Isomorphic(String s, String t) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder tb = new StringBuilder(t);
        int sa[] = new int[128];
        int va[] = new int[128];
        Arrays.fill(sa, -1);
        Arrays.fill(va, -1);

        for (int i = 0; i < sb.length(); i++) {
            char s1 = sb.charAt(i);
            char t1 = tb.charAt(i);

            if (sa[s1] == -1) {
                sa[s1] = t1;
            }
            if (va[t1] == -1) {
                va[t1] = s1;
            }
            if ((sa[s1] != t1) || (va[t1] != s1)) {
                return false;
            }
        }
        return true;
    }
}
