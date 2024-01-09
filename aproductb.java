import java.util.*;
public class aproductb {
    public static int product(int x,int y){
        int p;
        p=x*y;
        return p;
    }
    public static void main(String a[]) {
        Scanner ak = new Scanner(System.in);
        System.out.println("Enter Any Two Value");
        int b = ak.nextInt();
        int c = ak.nextInt();
        int j = product(b, c);
        System.out.println(j);
    }
}