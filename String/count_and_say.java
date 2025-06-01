package String;

public class count_and_say {
    public static void main(String[] args) {
        System.out.println(count(4)); // Output: "1211"
    }

    public static String count(int n) {
        StringBuilder str1 = new StringBuilder("1");

        for (int i = 2; i <= n; i++) {
            StringBuilder str2 = new StringBuilder();
            String s = str1.toString();

            for (int j = 0; j < s.length();) {
                int count = 1;

                // Count how many times the current digit repeats
                for (int k = j + 1; k < s.length() && s.charAt(k) == s.charAt(j); k++) {
                    count++;
                }

                str2.append(count);
                str2.append(s.charAt(j));
                j += count; // move j to the next group
            }

            str1 = str2;
        }

        return str1.toString();
    }
}
