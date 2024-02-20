public class inverterednumber {
    public static void main(String[] a){
        for(int i=1;i<=5;i++){
            int r=1;
            for(int j=5;j>=i;j--){
                System.out.print(r);
                r++;
            }
            System.out.println();
        }
    }
}
