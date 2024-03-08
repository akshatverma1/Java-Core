public class subarrayhw {
    public static void sub(int arrr[]){
            int end = arrr.length;
            int start=0;
            int sum = 0;
            int maxsum=0;
            for(int k=start;k<end;k++){
            for(int i=start;i<end;i++){
                for(int j=start;j<=i;j++){
                    //System.out.print(arrr[j]+" ");
                    sum=sum+arrr[j];
                }
                System.out.println(sum);
                if (sum>maxsum){
                    maxsum=sum;
                }
                sum=0;
            }
            System.out.println(); 
            start++;  
        }
        System.out.println("Max Sum Of Sub Arrays = "+maxsum);
        }
        public static void main(String a[]){
            int arrr[] ={1,-2,6,-1,3};
            sub(arrr);
        }    
}
