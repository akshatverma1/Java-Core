public class binarysearchtwo {
    public static int binarysearch(int arrr[],int key){
        int start=0;
        int end = arrr.length-1;
        while (start<=end) {
            int mid = ((start+end)/2);
            if (arrr[mid] == key){
                return mid;
            }
            if (arrr[mid]>key){
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return 3;
    }
    public static void main(String arr[]){
        int arrr[] = {2,4,6,8,10,12,14};
        int w = binarysearch(arrr,14);
        if (w==3){
            System.out.println("Key are Not Found");
        }else{
            System.out.println(w);
        }
    }
}