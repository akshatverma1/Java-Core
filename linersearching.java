public class linersearching {
    public static int seacrhing(int arr[], int number){
        for( int e=0;e<arr.length;e++){
            if (arr[e]==number){
               System.out.println("Mil gya is pa "+e); 
               return e;
            }
        }
        return -2;
    }
    public static void main(String[] a){
        int arr[] = {2,4,6,8,10,12,14};
        int l =seacrhing(arr,10);
    }
}
