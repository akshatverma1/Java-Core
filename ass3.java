/*Question3:Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. 
You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)*/
import java.util.*;
public class ass3 {
    public static void main(String i[]){
        char $ = 12;
        Scanner av = new Scanner(System.in);
        System.out.println("Enter The Price of Pencil");
        float Pencil = av.nextFloat();
        System.out.println("Enter The Price of Pencil");
        float pen = av.nextFloat();
        System.out.println("Enter The Price of Pencil");
        float eraser = av.nextFloat();
        float sum = Pencil+pen+eraser;
        System.out.println("Total Prices");
        System.out.println(sum);
        float g = 0.18f *sum;
        System.out.println("After GST Included");
        System.out.println(sum+g);
        System.out.print($);
    }
}
