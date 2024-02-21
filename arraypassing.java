import java.util.*;
public class arraypassing {
    public static void akshat(int arr[]) {
        System.out.println("Second function invoked");
        for(int i=0;i<arr.length;i++){
            arr[i]= arr[i]+2;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner aaa = new Scanner(System.in);
        //int arr[]={122,123,124};
        int arr[] = new int[3];
        System.out.println("Enter Any three Numbers");
        for (int r=0;r<arr.length;r++){
            arr[r] = aaa.nextInt();
        }
        akshat(arr);
    }
    
}
