import java.util.Scanner;

public class hackerq1 {
    public static void main(String arr[]) {
        int a[] = new int[11];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int y = 0;
        int x = 0;
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (i < 10) {
                sum = a[i + 1] - a[i];
                if (sum < 0) {
                    for (int o = sum; o < 0; o++) {
                        x++;
                        System.out.println(x);
                    }
                }
                y = sum + y + x;
                x = 0;
                // System.out.println(y);
            }
        }
        System.out.println(y);
    }
}
