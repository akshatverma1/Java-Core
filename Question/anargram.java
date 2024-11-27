package Question;

import java.util.*;

public class anargram {
    public static void main(String arr[]) {
        String str1 = "lesson";
        String str2 = "slient";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                char s1 = str1.charAt(i);
                char s2 = str2.charAt(j);
                if (s1 == s2) {
                    System.out.println("Anargram");
                    break;
                }
            }
            break;

        }
    }
}