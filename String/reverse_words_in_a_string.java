package String;

public class reverse_words_in_a_string {
    public static void main(String arr[]) {
        String str = new String();
        str = "akshat verma is a good boy";
        reverse(str);
    }

    public static void reverse(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }
}
