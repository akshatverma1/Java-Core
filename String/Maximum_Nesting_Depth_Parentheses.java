package String;

public class Maximum_Nesting_Depth_Parentheses {
    public static void main(String arr[]) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(Depth(s));
    }

    public static int Depth(String s) {
        int counter = 0;
        int countMax = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                counter++;
            } else if (s.charAt(i) == ')') {
                if (counter > countMax) {
                    countMax = counter;
                }
                counter--;
            }
        }
        return countMax;
    }
}
