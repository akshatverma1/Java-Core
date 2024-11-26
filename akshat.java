public class akshat {
    public static void main(String[] args) {
        String str = "lol";
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if (!((s == ',') || (s == ' '))) {
                str2 = str2 + Character.toString(s);
            }
        }
        // System.out.println(str2);
        for (int i = str.length() - 1; i >= 0; i--) {
            char s = str.charAt(i);
            if (!((s == ',') || (s == ' '))) {
                str1 = str1 + Character.toString(s);
            }
        }
        // System.out.println(str1);
        if (str1.equals(str2)) {
            System.out.println("Palindome");
        } else {
            System.out.println("Do not Palindome");
        }

    }
}
