package String;

import java.util.*;

public class longest_Common_Prefix {
    public static void main(String arr[]) {
        String strs[] = { "" };
        System.out.println(longest(strs));
    }

    public static String longest(String strs[]) {
        System.out.println(strs.length);
        Arrays.sort(strs);
        char First[] = strs[0].toCharArray();
        char End[] = strs[strs.length - 1].toCharArray();
        StringBuilder strFinal = new StringBuilder("");
        for (int i = 0; i < strs.length; i++) {
            if (First[i] != End[i]) {
                break;
            }
            strFinal.append(First[i]);
        }
        return strFinal.toString();
    }
}
