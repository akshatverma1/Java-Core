import java.util.*;

public class recurrsison {
    public static void removeeee(String str, boolean arr[], int n, StringBuilder newstr) {
        if (n == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currnetchar = str.charAt(n);
        if (arr[currnetchar - 'a'] == true) {

            removeeee(str, arr, n + 1, newstr);
        } else {
            arr[currnetchar - 'a'] = true;
            removeeee(str, arr, n + 1, newstr.append(currnetchar));
        }
    }

    public static void main(String args[]) {
        int y = 0;
        boolean arr[] = new boolean[26];
        StringBuilder newstrr = new StringBuilder("");
        String str = "akshat";
        removeeee(str, arr, y, newstrr);
    }
}