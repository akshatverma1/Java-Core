import java.util.*;
import java.math.*;
public class oltriangle {
    public static void main(String[] a)
    {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if ((((!(i%2==0))||(!(j%2==0)))&&(((j%2==0))||(i%2==0)))) 
                {
                    System.out.print("0");   
                } 
                else{
                    System.out.print("1");
                }  
            }
            System.out.println();
        }
    }
}