import java.util.Scanner;

public class hackerrank {
    public static void main(String arr[]){
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        if (!(n%2==0)){
            System.out.println("Weird");
        }else if ((2<n)&&(n<5)){
            System.out.println("Not Weird");
        }else if((6<n)&&(n<=20)){
            System.out.println("Weird");
        }else if (n>20){
            System.out.println("Not Weird");
        }
    }
}
