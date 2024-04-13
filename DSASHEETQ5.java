public class DSASHEETQ5 {
    public static int same(String S, int lengthh) {
        if (lengthh == 0) {
            return 1;
        }
        int single = same(S, lengthh - 1);
        int total = single + 1;
        return total;
    }

    public static void main(String arr[]) {
        String S = new String("abcab");
        int lengthh = S.length() - 1;
        System.out.println(same(S, lengthh));
    }
}
