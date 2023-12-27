/*Question1:Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N) */
import java.util.*;
public class ass1 {
    public static void main(String ary[]){
        System.out.println("Enter The Value of a,b & c");
        Scanner av = new Scanner(System.in);
        float a = av.nextInt();
        float b = av.nextInt();
        float c = av.nextInt();
        float Average = ((a+b+c)/3);
        System.out.print(Average);  
    }
}
