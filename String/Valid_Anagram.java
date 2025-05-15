package String;

import java.util.*;

public class Valid_Anagram {
    public static void main(String arr[]) {
        String s = "anagram", t = "nagaram";
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
                if (s.charAt(i) == t.charAt(j)) {
                    frequency[s.charAt(j)] -= 1;
                }
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i)] >= 0) {
                return false;
            }
        }
        return true;
    }
}
