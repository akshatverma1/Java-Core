public class DSASHEETQ5 {
    public static int same(String S, int lengthh) {
        if (lengthh == 0) {
            return 1;
        }
        int single = same(S, lengthh - 1);
        int total = single + 1;
        return total;
    }

    public static int substring(String S) {
        int ways = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j < S.length(); j++) {
                if (S.charAt(i) == S.charAt(j)) {
                    ways++;
                }
            }
        }
        return ways;
    }

    public static void main(String arr[]) {
        String S = new String("aba");
        int lengthh = S.length() - 1;
        System.out.println(substring(S));
    }
}
