import java.util.*;
import javax.swing.text.Style;
import javax.swing.text.StyledEditorKit;
import java.math.*;
public class decimal_to_binary {

    public static int dtob(int y) {
        int e,mul=0;
        for(int i=0; ;i++){
            e=y%2;
            System.out.println(e);
            mul = mul+(e*((int)Math.pow(10, i)));
            y=y/2;
            if(y==0){
                break;
            }   
        }
        System.out.println(mul);
        return y;
    }
    public static void main(String a[]) {
        System.out.println("Enter Any Number you want to Convert Decimal to Binary");
        Scanner ak = new Scanner(System.in);
        int d = ak.nextInt();
        int f = dtob(d);
        //System.out.println(f);
    }
}
