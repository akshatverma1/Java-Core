import java.util.*;

public class complex {
    public static void user() {
        Scanner s = new Scanner(System.in);
        int q, w, e, r;
        System.out.println("Enter the first Complex number");
        q = s.nextInt();
        System.out.print("+i");
        w = s.nextInt();
        System.out.println("Enter the Second Complex number");
        e = s.nextInt();
        System.out.print("+i");
        r = s.nextInt();

        // choice a function
        System.out.println("Enter the Number 1=SUM,2=DIFFERENCE,3=MULTIPLCATION");
        int a = s.nextInt();
        switch (a) {
            case 1: {
                sum(q, w, e, r);
                System.out.println("Sum Invoked");
            }
                break;
            case 2: {
                diff(q, w, e, r);
                System.out.println("Difference Invoked");
            }
                break;
            case 3: {
                mul(q, w, e, r);
                System.out.println("Mult Invoked");
            }
                break;
        }
    }

    public static void sum(int a, int b, int c, int d) {
        int real_number, imaginary_number;
        real_number = a + c;
        imaginary_number = b + d;
        System.out.println(real_number + "+i" + "(" + imaginary_number + ")");
    }

    public static void diff(int a, int b, int c, int d) {
        int real_number, imaginary_number;
        real_number = a - c;
        imaginary_number = b - d;
        System.out.println(real_number + "+i" + "(" + imaginary_number + ")");
    }

    public static void mul(int a, int b, int c, int d) {
        int real_number, imaginary_number;
        real_number = a * c;
        imaginary_number = b * d;
        System.out.println(real_number + "+i" + "(" + imaginary_number + ")");
    }

    public static void main(String[] args) {
        user();
    }
}
