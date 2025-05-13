package String;

import java.util.*;

public class longest_Common_Prefix {
    public static void main(String arr[]) {
        String strs[] = { "", "" };
        System.out.println(longest(strs));
    }

    public static String longest(String strs[]) {
        System.out.println(strs.length);
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int index = 0;
        while (index < str1.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return index == 0 ? "" : str1.substring(0, index);
    }
}
