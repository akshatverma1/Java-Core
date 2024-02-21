import java.util.*;
public class find_largest {
    public static void akshat(int arr[]){
        int compare=0;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            if (compare<=arr[i]){
                compare=arr[i];
            }
        }
        System.out.println("This is a Largest Value = "+compare);
    }
    public static void main(String[] args) {
        Scanner ak = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Any 5 Numbers");
        for(int i=0;i<arr.length;i++){
            arr[i] = ak.nextInt();
        }
        //int arr[]={0,2,6,3,5};
        akshat(arr);
    }
}