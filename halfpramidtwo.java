public class halfpramidtwo {
    public static void main(String[] a){
        int y=1;
        for(int i=1;i<=5;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(y);
                    y++;
                }
                y=1;
                System.out.println();
        }
    }
}