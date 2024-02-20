public class butterflypattern {
    public static void main(String[] a){
        for(int i=1;i<=4;i++){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int j=6;j>=i*2-1;j--){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
            }            
    
        for(int z=1;z<=4;z++){
            for(int kk=4;kk>=z;kk--){
                System.out.print("*");
            }
            for(int j=1;j<=z*2-2;j++){
                System.out.print(" ");
            }
            for(int l=4;l>=z;l--){
                System.out.print("*");
            }
            System.out.println();
        }
   }
}

    


