import java.util.*;

public class Fibonacci {
    public static void main(String arr[]) {
        int firstterm = 0;
        int secondterm = 1;
        int n = 7;
        for (int i = 1; i < n; i++) {
            int next = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = next;
            System.out.print(next + " ");
        }
    }
}