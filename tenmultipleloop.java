import java.util.*;
public class tenmultipleloop {
    public static void main(String aa[]){
        Scanner ak = new Scanner(System.in);
        for(int i=1; ;i++){
            int p = ak.nextInt();
            //System.out.println("Print Value"+ p);
            if (p%10==0) {
                System.out.println("Print Value = "+ p);
                System.out.println("Out From loop");
                continue;
            }
        }
    }
}
