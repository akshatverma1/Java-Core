package String;

import java.util.*;

public class Valid_Anagram {
    public static void main(String arr[]) {
        String s = "car", t = "rac";
        System.out.println(Anagram(s, t));
    }

    public static boolean Anagram(String s, String t) {
        int frequency1[] = new int[128];
        Arrays.fill(frequency1, 0);
        int frequency2[] = new int[128];
        Arrays.fill(frequency2, 0);
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char f = s.charAt(i);
            frequency1[f]++;
        }
        for (int i = 0; i < t.length(); i++) {
            char f = t.charAt(i);
            frequency2[f]++;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if ((s.charAt(i) == s.charAt(j)) && (i != j)) {
                    if (frequency1[s.charAt(i)] == frequency2[s.charAt(j)]) {
                        break;
                    } else {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
