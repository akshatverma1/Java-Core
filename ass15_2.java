import java.util.*;
import java.math.*;
public class ass15_2 {
    public static int palindrome(int y){
        int r=0,c=0,t,b,cout=0,m;
        b=y;
        m=y;
        for(int j=0; ;j++){
            t=m%10;
            cout++;
            m=m/10;
            if (m==0) {
                break;
            }
        }
        for(int i=cout; ;i--){
            t=y%10;
            c = c +(t*((int)Math.pow(10,i)));
            y = y/10;
            if (y==0) {
                break;
            }
        }
        System.out.println(c);
        if (b==c)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        return 0;
    }
    public static void main(String a[]){
        Scanner ak = new Scanner(System.in);
        int q = ak.nextInt();
        palindrome(q);
    }
}
