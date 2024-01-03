//Write a Javaprogram to get a number from the user and print whether it is positive or negative.
import java.util.*;
public class q11_1 {
    public static void main(String arrr[]){
        System.out.println("Enter the Any Value");
        Scanner ak = new Scanner(System.in);
        int a = ak.nextInt();
        if(a>=0){
            System.out.println("It's Positive Number");
        }else{
            System.out.println("It's Negative Number");
        }
    }
}
