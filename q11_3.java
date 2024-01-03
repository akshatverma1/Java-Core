//WriteaJavaprogramtoinputweeknumber(1-7)andprintdayofweeknameusing switch case
import java.util.*;
public class q11_3 {
    public static void main(String arr[]){
        System.out.println("Sunday\nMonday\nTuesday\nWednesday\nThusday\nFriday\nSaturday");
        Scanner ak = new Scanner(System.in);
        int a = ak.nextInt();
        switch(a){
            case 1 : System.out.println("Sunday");
            break;
            case 2 : System.out.println("Monday");
            break;
            case 3 : System.out.println("Tuesday");
            break;
            case 4 : System.out.println("Wednesday");
            break;
            case 5 : System.out.println("Thusday");
            break;
            case 6 : System.out.println("Friday");
            break;
            case 7 : System.out.println("Saturday");
            break;
        }
    }
}