public class DSASHEETQ4 {
    public static int contiguoussubstring(String S, int l) {
        if (l == 0) {
            return 1;
        }
        int single = contiguoussubstring(S, l - 1);
        int total = single;
        return total;
    }

    public static void main(String ar[]) {
        String str = new String("abcab");
        int l = str.length() - 1;
        System.out.println(contiguoussubstring(str, l));
    }
}
