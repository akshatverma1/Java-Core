package String;

import java.util.Arrays;

public class minimum_window_substring {
    public static void main(String arr[]) {
        String s = "ADOBECODEBANC", t = "ABC";
        String str2 = "";
        int frequency[] = new int[128];
        Arrays.fill(frequency, -1);
        int counter = 0;
        int count = 0;
        for (int i = 0; i < t.length(); i++) {
            char n = t.charAt(i);
            if (frequency[n] == -1) {
                frequency[n] = 0;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (frequency[s.charAt(j)] == 0) {
                    counter++;
                }
                if (counter == t.length()) {
                    // System.out.println(s.substring(i, j + 1));
                    counter = 0;
                    if (count == 0) {
                        str2 = s.substring(i, j + 1);
                        count++;
                    }
                    if ((str2.length()) >= (s.substring(i, j + 1).length())) {
                        str2 = s.substring(i, j + 1);
                    }
                }
            }
            counter = 0;
        }
        System.out.println(str2);
    }
}
