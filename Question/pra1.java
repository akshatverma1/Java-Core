package Question;

public class pra1 {
    public static void main(String arr[]) {
        String s = "cbbd";
        for (int i = 0; i < s.length(); i++) {
            String str1 = "";
            String str2 = "";
            str1 = str1 + s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    str1 = str1 + s.charAt(j);
                    break;
                } else {
                    str1 = str1 + s.charAt(j);
                }
            }
            for (int k = str1.length() - 1; k >= 0; k--) {
                str2 = str2 + str1.charAt(k);
            }
            if (str1.equals(str2)) {
                System.out.println(str1);
                break;
            }
        }
    }
}
