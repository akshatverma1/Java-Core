import java.util.*;
public class basic {
    public static void main(String arr[]){
        Scanner a = new Scanner(System.in);
        int arrrr[] = new int[6];
        for(int i=1;i<=5;i++){
            System.out.println("Enter the value of "+ i);
            arrrr[i] = a.nextInt();
        }
        for(int j=1;j<=5;j++){
            System.out.println(arrrr[j]);
        }
    }
}
