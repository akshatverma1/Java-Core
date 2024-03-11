import java.util.*;
public class functionpassing {
    public static void update(int akshat[]) {
        Scanner m = new Scanner(System.in);
        System.out.println("Update Function Invoked");
        for(int j=0;j<3;j++){
            System.out.println("Enter the value of "+j);
            akshat[j] = m.nextInt();
        }    
    }
    public static void main(String[] args) {
        int akshat[] = {2,3,4};
        for(int i=0;i<3;i++){
            System.out.println(akshat[i]);
        }
        update(akshat);
        System.out.println("Result");
        for(int i=0;i<3;i++){
            System.out.println(akshat[i]);
        }
    }
}