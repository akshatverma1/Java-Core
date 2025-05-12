package String;

import java.util.*;

public class reverse_words_in_a_string {
    public static void main(String arr[]) {
        String str = new String();
        str = "akshat verma is a good boy";
        reverse(str);
    }

    public static void reverse(String str) {
        StringBuilder str2 = new StringBuilder(str);
        StringBuilder str4 = new StringBuilder();
        str2.reverse();
        str2.toString();
        StringBuilder str3 = new StringBuilder("");
        for (int i = 0; i < str2.length(); i++) {
            while ((i < str2.length()) && ((str2.charAt(i)) != ' ')) {
                str3.append(str2.charAt(i));
                i++;
            }
            str3.reverse();
            System.out.println(str3);
        }
    }
}
