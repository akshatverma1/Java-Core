/*Question2:Inaprogram,inputthesideofasquare.
Youhavetooutputtheareaofthesquare.(Hint : area of a square is (side x side))*/
import java.util.*;
public class ass2 {
    public static void main(String tt[]){
        Scanner av = new Scanner(System.in);
        System.out.println("Enter the value of side");
        float s = av.nextFloat();
        float r = s*s;
        System.out.println(r);
    }
}