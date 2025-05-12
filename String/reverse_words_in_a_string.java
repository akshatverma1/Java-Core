package String;

import java.util.*;

public class reverse_words_in_a_string {
    public static void main(String arr[]) {
        String str = new String();
        str = "  hello world ";
        reverse(str);
    }

    public static void reverse(String str) {
        // System.out.println(str);
        StringBuilder strReverse = new StringBuilder(str);
        StringBuilder finalstr = new StringBuilder("");
        strReverse.toString();
        strReverse.reverse();
        for (int i = 0; i < strReverse.length(); i++) {
            StringBuilder strWord = new StringBuilder();
            strWord.toString();
            while ((i < strReverse.length()) && ((strReverse.charAt(i)) != ' ')) {
                strWord.append(strReverse.charAt(i));
                i++;
            }
            strWord.reverse();
            if (strWord.length() > 0)
                finalstr.append(" " + strWord);
        }
        System.out.println(finalstr.substring(1));
    }
}