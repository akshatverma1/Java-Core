package String;

public class Largest_odd_number_in_a_string {
    public static void main(String arr[]) {
        String s = "34560";
        System.out.println(oddNumber(s));
    }

    public static String oddNumber(String s) {
        int number = Integer.parseInt(s);
        StringBuilder strValue = new StringBuilder("");
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String str1 = s.substring(i, j);
                System.out.println(str1);
                int value = Integer.parseInt(str1);
                if ((value % 2) != 0) {
                    if (value >= max) {
                        max = value;
                    }
                }
            }

        }
        String Finalstr = Integer.toString(max);
        return Finalstr;
    }
}
