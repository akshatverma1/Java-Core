package String;

public class Maximum_Nesting_Depth_Parentheses {
    public static void main(String arr[]) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(Depth(s));
    }

    public static int Depth(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        return 6;
    }
}
