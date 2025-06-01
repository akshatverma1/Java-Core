package String;

public class Shortes_Palindrome {
    public static void main(String arr[]) {
        String s = "abbacd";
        System.out.println(shorts(s));
    }

    public static String shorts(String s) {
        StringBuilder str = new StringBuilder(s);
        int startIndex = 0;
        int pivot = 1;
        int endIndex = str.length() - 1;
        while (startIndex < endIndex) {
            if (str.charAt(startIndex) == str.charAt(endIndex)) {
                startIndex++;
                endIndex--;
                System.out.println("apply");
            } else {
                System.out.println("Unapply");
                str.reverse().append(s.charAt(pivot)).reverse();
                pivot++;
                endIndex++;
            }
        }
        return str.toString();
    }
}
