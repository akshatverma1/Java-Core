import java.util.*;
public class ass_11 {
    public static void main(String a[]) {
    Scanner ak = new Scanner(System.in);
    System.out.println("Enter the Any Integer");
    int n = ak.nextInt();
        char u ='a';
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=i;j++)
            {
            System.out.print(u);
            u++;
            }
            System.out.println();
        }
    }
}