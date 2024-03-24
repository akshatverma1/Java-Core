public class q1string {
    public static void lowwercase(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || (s.charAt(i) == 'o')
                    || (s.charAt(i) == 'u')) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }

    // a,e,i,o,u
    public static void main(String[] args) {
        String s = "akshat";
        lowwercase(s);
    }
}
