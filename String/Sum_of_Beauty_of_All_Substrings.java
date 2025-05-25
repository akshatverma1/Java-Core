package String;

import java.util.*;

public class Sum_of_Beauty_of_All_Substrings {
    public static void main(String arr[]) {
        String s = "aabcbaa";
        System.out.println(Beauty(s));
    }

    public static int Beauty(String s) {
        int beautyCount = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                HashMap<Character, Integer> hm = new HashMap<>();
                for (int k = 0; k < sub.length(); k++) {
                    char c = sub.charAt(k);
                    if (hm.containsKey(c)) {
                        hm.put(c, hm.get(c) + 1);
                    } else {
                        hm.put(c, 1);
                    }
                }
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int u = 0; u < sub.length(); u++) {
                    max = Math.max(max, hm.get(sub.charAt(u)));
                    min = Math.min(min, hm.get(sub.charAt(u)));
                }
                beautyCount = max - min;
                sum += beautyCount;
            }
        }
        return sum;
    }
}

// import java.util.*;

// class Solution {
// public int beautySum(String s) {
// int beauty = 0;
// int n = s.length();

// for (int i = 0; i < n; i++) {
// int[] freq = new int[26];

// for (int j = i; j < n; j++) {
// char c = s.charAt(j);
// freq[c - 'a']++;

// int max = 0;
// int min = Integer.MAX_VALUE;

// for (int f : freq) {
// if (f > 0) {
// max = Math.max(max, f);
// min = Math.min(min, f);
// }
// }

// beauty += (max - min);
// }
// }

// return beauty;
// }
// }
