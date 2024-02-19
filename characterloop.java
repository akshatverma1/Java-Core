public class characterloop {
    public static void main(String[] a){
        char k='a';
        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}