public class diamondpattern {
    public static void main(String[] a){
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
                for(int u=1;u<=i;u++){
                    System.out.print("*");
                }
                if (i>1) {
                    for(int r =2;r<=i;r++){
                        System.out.print("*");
                    }
                }
            System.out.println();
        }
        //second loop
        for(int i=1;i<=4;i++){
            for(int d=1;d<=i;d++){
                System.out.print(" ");
            }
            for(int u=4;u>=i;u--){
                System.out.print("*");
            }    
            for(int f=i;f<=3;f++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
