public class subarraytwo {
    public static void sub(int arrr[]){
        int end = arrr.length;
        int start=0;
        for(int k=start;k<end;k++){
        for(int i=start;i<end;i++){
            for(int j=start;j<=i;j++){
                System.out.print(arrr[j]+" ");
            }
            System.out.println();
        }
        System.out.println(); 
        start++;  
    }
    }
    public static void main(String a[]){
        int arrr[] ={2,4,6,8,10};
        sub(arrr);
    }
}