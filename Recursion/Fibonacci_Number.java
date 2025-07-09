package Recursion;

public class Fibonacci_Number {
    public static void main(String arr[]) {
        System.out.println(Fibonacci(1));
    }

    public static int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return Fibonacci(n - 2) + Fibonacci(n - 1);
    }
}
