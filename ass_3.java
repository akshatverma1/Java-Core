import java.util.*;
public class ass_3 {
    public static void main(String ee[]){
        Scanner ak = new Scanner(System.in);
        System.out.println("Enter Any Integer");
        double a = ak.nextDouble();
        double fac=1;
        for(int i=0; ;i++){
            if (a==0) {
                break;
            }
            fac = fac*a;
            a--;
        }
        System.out.println(fac);
    }
}