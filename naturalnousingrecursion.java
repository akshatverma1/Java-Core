import java.util.Scanner;

public class naturalnousingrecursion {
    public static int naturalno(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = naturalno(n - 1);
        int total = n + sum;
        return total;
    }

    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Any Number");
        int y = sc.nextInt();
        System.out.println(naturalno(y));

    }
}
