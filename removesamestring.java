import java.util.Scanner;

public class removesamestring {
    public static void remove(String str, Boolean arr[], int n, StringBuilder newstr) {
        if (n == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currnetchar = str.charAt(n);
        if (arr[currnetchar - 'a'] == true) {
            remove(str, arr, n + 1, newstr);
        } else {
            arr[currnetchar - 'a'] = true;
            remove(str, arr, n + 1, newstr.append(currnetchar));
        }
    }

    public static void main(String ar[]) {
        String str = "akshat";
        remove(str, new Boolean[26], 0, new StringBuilder(""));
    }
}