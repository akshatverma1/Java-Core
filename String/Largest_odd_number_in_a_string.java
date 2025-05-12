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
        if ((number % 2) != 0) {
            String str = Integer.toString(number);
            return str;
        } else {
            for (int i = 0; i < s.length(); i++) {
                for (int j = i; j < s.length(); j++) {
                    for (int k = i; k < j; k++) {
                        strValue.append(s.charAt(k));
                    }
                    String str2 = strValue.toString();
                    int value = Integer.parseInt(str2);
                    if ((value % 2) != 0) {
                        if (value > max) {
                            max = value;
                        }
                    }
                }

            }
        }
        String Finalstr = Integer.toString(max);
        return Finalstr;
    }
}
