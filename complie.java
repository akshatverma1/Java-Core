import java.util.Scanner;

class Question {
    Scanner sc = new Scanner(System.in);
    int e1 = sc.nextInt(); // Read e1
    int e2 = sc.nextInt(); // Read e2
}

public class complie {
    public static int swap() {
        Question a = new Question();
        int temp;
        temp = a.e1;
        a.e1 = a.e2;
        a.e2 = temp;
        return 0;
    }

    public static void main(String[] argsss) {
        Question t = new Question();
        System.out.println("Before Swap: " + t.e1 + " " + t.e2);
        swap();
        System.out.print("After Swap: " + t.e1 + " " + t.e2);
    }
}