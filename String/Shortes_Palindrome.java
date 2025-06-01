package String;

public class Shortes_Palindrome {
    public static void main(String arr[]) {
        String s = "abcd";
        System.out.println(shorts(s));
    }

    public static String shorts(String s) {
        StringBuilder str = new StringBuilder(s);
        int startIndex = 0;
        int pivot = 0;
        int endIndex = str.length() - 1;
        while (startIndex < endIndex) {
            if (str.charAt(startIndex) == str.charAt(endIndex)) {
                startIndex++;
                endIndex--;
            } else {
                str.insert(0, str.charAt(pivot + 1));
                pivot++;
            }
        }
        return str.toString();
    }
}
