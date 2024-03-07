public class subarrays {
    public static void sub(int number[]){
        for(int i=0;i<number.length;i++){
            System.out.print("(");
            for (int j=i;j<number.length;j++){
                System.out.print(number[j]);
                if (j==(number.length-1)) {
                    
                }else{
                    System.out.print(",");
                }
            }
            System.out.print(")");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,11};
        sub(number);
    }
}
