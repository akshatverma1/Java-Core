package String;

import java.util.*;

public class Valid_Anagram {
    public static void main(String arr[]) {
        String s = "rat", t = "car";
        System.out.println(Anagram(s, t));
    }

    public static boolean Anagram(String s, String t) {
        int frequency[] = new int[128];
        Arrays.fill(frequency, 0);
        for (int i = 0; i < s.length(); i++) {
            char f = s.charAt(i);
            frequency[f]++;
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 0) {

                }
            }
        }
        // boolean sea[] = new boolean[s.length()];
        // Arrays.fill(sea, false);
        // if (s.length() != t.length()) {
        // return false;
        // }
        // for (int i = 0; i < s.length(); i++) {
        // for (int j = 0; j < s.length(); j++) {
        // if (s.charAt(i) == t.charAt(j)) {
        // sea[i] = true;
        // break;
        // } else {
        // sea[i] = false;
        // }
        // }
        // }
        // for (int i = 0; i < sea.length; i++) {
        // if (sea[i] == false) {
        // return false;
        // }
        // }
        return true;
    }
}
