
import java.util.*;

public class certificate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String sum = new String();
        String a[] = new String[5];
        int u = 0;
        // enter value
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.next();
            if ((a[i] == sum.charAt(i)) || (a[i] == "2") || (a[i] == "3") || (a[i] == "4") || (a[i] == "5")
                    || (a[i] == "6") ||
                    (a[i] == "7") || (a[i] == "8") || (a[i] == "9") || (a[i] == "0")) {
                u++;
            }

        }
        System.out.println(u);
    }
}
