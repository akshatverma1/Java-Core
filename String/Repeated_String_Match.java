package String;

public class Repeated_String_Match {
    public static void main(String arr[]) {
        String a = "a", b = "aa";
        System.out.println(RepeatedString(a, b));
    }

    public static int RepeatedString(String a, String b) {
        int repeat = 1;
        StringBuilder str1 = new StringBuilder("");
        while (a.length() < b.length()) {
            str1.append(a);
            repeat++;
        }
        if (str1.indexOf(b) != -1)
            return repeat;

        str1.append(a);
        repeat++;
        if (str1.indexOf(b) != -1)
            return repeat;
        return -1;
    }
}
