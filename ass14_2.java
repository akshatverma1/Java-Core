import java.util.*;
public class ass14_2 {
    public static boolean even(int q){
        if (q%2==0) {
            return true;
        }
        else {
            System.out.println("False");
        }
        return false;
    }
    public static void main(String a[]){
        Scanner ak = new Scanner(System.in);
        System.out.println("Enter the Value");
        int u = ak.nextInt();
        even(u);
    }
}