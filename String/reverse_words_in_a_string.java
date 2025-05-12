package String;

import java.util.*;

public class reverse_words_in_a_string {
    public static void main(String arr[]) {
        String str = new String();
        str = "akshat verma is a good boy";
        reverse(str);
    }

    public static void reverse(String str) {
        // System.out.println(str);
        StringBuilder strReverse = new StringBuilder(str);
        strReverse.toString();
        strReverse.reverse();
        System.out.println(strReverse);
    }
}