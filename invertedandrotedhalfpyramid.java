public class invertedandrotedhalfpyramid {
    public static void main(String[] a){
        int y=4;
        int r=3;
        int w=2;
        int s=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(((i==1)||(i==2)||(i==3)||(i==4))&&(!((j==r)||(j==w)||(j==s)))){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            y--;
            r--;
            w--;
            s--;
            System.out.println();
        }
    }
}
