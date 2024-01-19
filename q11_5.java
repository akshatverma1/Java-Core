//Write a Java program that take sa year from the user and print whether that year is a leap year or not.
import java.util.Scanner;
public class q11_5 {
    public static void main(String arr[]){
        System.out.println("Enter Any Year");
        Scanner ak = new Scanner(System.in);
        int s = ak.nextInt();
        if ((s%4==0)/*&&(!(s%100==0))&&(s%400==0)*/) {
            System.out.println("Leap Year");
        }
        else if(!(s%100==0)){
            System.out.println("Leap Year");
        }
        else if((s%400==0)){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}