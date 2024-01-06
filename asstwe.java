import java.util.*;
public class asstwe {
    public static void main(String a[]){
        Scanner ak = new Scanner(System.in);
        int sum=0,min=0;
        
        for (int i = 1;i<=4;i++)
        {
            System.out.println("Enter the value of = "+i);
            int s = ak.nextInt();
            if(s%2==0){
            sum = (sum + s);
            }
            else{
                min = (min + s);
            }
        }
        System.out.println("Even Number = " + sum);
        System.out.println("Odd Number = " + min);
    }
}