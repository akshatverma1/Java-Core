import java.util.*;
import java.math.*;
public class binary_to_decimal {
    public static int btod(){
        Scanner ak = new Scanner(System.in);
        System.out.println("Enter the any integer you want to Convert Binary to decimal");
        int n = ak.nextInt();
        int uuu,v,m=0;
        for(int i=0; ;i++){
            v = n%10;
            uuu = (v*((int)Math.pow(2,i)));
            m=m+uuu;
            n=(n/10);
            if (n==0){
                break;
            }
            }
            System.out.println("After Converting Binary To decimal = "+m);
        return 0;
    }
    public static void main(String a[]){
        btod();
    }
}