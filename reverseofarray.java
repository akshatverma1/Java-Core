public class reverseofarray {
    public static void reverse(int arrrr[]){
        System.out.println("Reverse Array Invoked");
        int start=0;
        int end = arrrr.length-1;
        while (start<=end) {
            int temp;
            temp = arrrr[start];
            arrrr[start]=arrrr[end];
            arrrr[end]=temp;
            start++;
            end--;
        }
        for(int j=0;j<arrrr.length;j++){
            System.out.println(arrrr[j]);
        }
    }
    public static void main(String arr[]){
        int arrrr[] = {2,4,6,8};
        for(int i=0;i<arrrr.length;i++){
            System.out.println(arrrr[i]);
        }
        reverse(arrrr);
    }
}