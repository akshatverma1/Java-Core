package String;

import java.util.Arrays;

public class minimum_window_sunstring {
    public static void main(String arr[]) {
        String s = "ADOBECODEBANC", t = "ABC";
        int frequency[] = new int[128];
        Arrays.fill(frequency, -1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                char n = s.charAt(j);
                if (frequency[n] == -1) {
                    frequency[n] = 0;
                }

            }
        }
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i]);
        }
    }
}
