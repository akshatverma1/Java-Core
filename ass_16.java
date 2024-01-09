import java.util.*;

import javax.swing.text.Style;
public class ass_16 {
    public static int five(int n){
        int sum=0;
        int h;

        for (int i=0;;i++){
            h = n%10;
            sum = sum +h;
            System.out.print(h);
            n = n/10;
            if (n==0){
                break;
            }
        }
        System.out.println();
        return sum;
    }
    public static void main(String a[]){
        Scanner ma = new Scanner(System.in);
        System.out.println("Enter The Any Integer");
        int enterdigit = ma.nextInt();
        int r = five(enterdigit);
        System.out.println(r);
    }
}
