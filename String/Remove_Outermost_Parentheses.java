package String;

public class Remove_Outermost_Parentheses {
    public static void main(String arr[]) {
        String s = "(()())(())";
        StringBuilder str = new StringBuilder();
        str.toString();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (counter > 0) {
                    str.append(s.charAt(i));
                }
                counter++;
            } else {
                counter--;
                if (counter > 0) {
                    str.append(s.charAt(i));
                }
            }
        }
        System.out.println(str);
    }
}
