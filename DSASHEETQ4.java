public class DSASHEETQ4 {
    public static int contiguoussubstring(String S, int l) {
        if (l == 0) {
            return 1;
        }
        int single = contiguoussubstring(S, l - 1);
        int total = single + l;
        return total;
    }

    public static void main(String ar[]) {
        String str = new String("aba");
        int l = str.length() - 1;
        System.out.println(contiguoussubstring("aba", l));
    }
}
