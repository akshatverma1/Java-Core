import java.util.*;
public class ass_4 {
    public static void main(String arr[]) {
        Scanner ak = new Scanner(System.in);
        System.out.println("Enter the Any Number you want to print Table");
        int a = ak.nextInt();
        int mul = 1;
        System.out.println("This ia a Table of "+a);
        for (int i=1;i<=10;i++){
            mul = a*i;
            System.out.println(a+" "+"x"+" "+i+" "+"="+" "+mul);
        }
    }
}
