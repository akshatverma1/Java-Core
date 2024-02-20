public class hollowrhombus {
        public static void main(String[] a){
            for(int i=1;i<=4;i++){
                for(int j=4;j>=i;j--){
                    System.out.print(" ");
                    }
                    for(int w=1;w<=4;w++){
                        if ((w==1)||(i==4)||(w==4)||(i==1)) {
                            System.out.print("*");   
                        }
                        else{
                            System.out.print(" ");
                        }
                }
                System.out.println();
            }
        }
    }
