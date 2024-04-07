import java.util.Scanner;

public class s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sum = new StringBuffer("");
        String a[] = new String[5];
        // enter value
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.next();
            sum = sum.append(a[i]);
        }
        System.out.println(sum);
    }
}
