public class reserveno {
    public static void main(String arr[]){
        int r = 9122004;
        // int e = r/10;
        // int w = r%10;
        // System.out.println(e);
        // System.out.println(w);
        for(int i = 1;r>0;i++){
        
            System.out.print(r%10);
            r = r/10;
            // System.out.println(r/10);
        }
        System.out.println(r);
    }
}