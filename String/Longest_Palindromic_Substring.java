package String;

public class Longest_Palindromic_Substring {
    public static void main(String arr[]) {
        String s = "ac";
        System.out.println(palindromic(s));
    }

    public static String palindromic(String s) {
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String s2 = s.substring(i, j + 1);
                if (check(s2)) {
                    if (s2.length() > s1.length()) {
                        s1 = s2;
                    }
                }
            }
        }
        return s1;
    }

    public static boolean check(String sub) {
        int start = 0;
        int end = sub.length() - 1;
        while (start < end) {
            if (sub.charAt(start) != sub.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
}
