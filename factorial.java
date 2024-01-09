import java.util.*;
public class factorial {
    public static void main(String a[]) {
        double d = factorial();
        System.out.println(d);
    }
    public static double factorial(){
        Scanner am = new Scanner(System.in);
        System.out.println("Enter The Those Integer You Want To Print Factorial");
        double n = am.nextDouble();
        //double e;
        //e=n;
        double mul = 1;
        for(double i=1;i<=n;i++){
            mul = mul*i;
        }
        return mul;
    }
}
