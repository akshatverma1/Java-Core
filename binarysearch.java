public class binarysearch {
    public static int akshat(int arrr[],int key){
        int start=0;
        int end=arrr.length-1;
        
        while (start<=end) {
            int mid=((start+end)/2);
            if (arrr[mid]==key) {//Key are Found
                return mid;
            }
            if (arrr[mid]<key) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return 0;
    }
    public static void main(String arr[]){
        int arrr[]={2,4,6,8,10,12,14,16};
        int key = 14;
        int u=akshat(arrr, key);
        System.out.println(u);
        
    }
}