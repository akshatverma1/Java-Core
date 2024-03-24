import java.util.Scanner;

public class palindome {
    public static int palindomefinder(String input) {
        int n = input.length();
        for (int i = 0; i < input.length() / 2; i++) {
            if ((input.charAt(i)) != (input.charAt(n - 1 - i))) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("Enter Anu Word");
        input = sc.nextLine();
        int u = palindomefinder(input);
        if (u == 1) {
            System.out.println("Palindome");
        } else {
            System.out.println("Not Palindome");
        }
    }
}