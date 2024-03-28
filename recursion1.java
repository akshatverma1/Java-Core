public class recursion1 {
    public static void decresingg(int n) {
        if (n >= 0) {
            System.out.println(n);
            n--;
            decresingg(n);
        }
    }

    public static void main(String arr[]) {
        decresingg(10);
    }
}
