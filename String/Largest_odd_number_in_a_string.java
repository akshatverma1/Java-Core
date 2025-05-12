package String;

public class Largest_odd_number_in_a_string {
    public static void main(String arr[]) {
        String s = "34567";
        System.out.println(oddNumber(s));
    }

    public static String oddNumber(String s) {
        int number = Integer.parseInt(s);
        if ((number % 2) != 0) {
            String str = String.valueOf(number);
            return str;
        } else {

        }
        return "akash";
    }
}
