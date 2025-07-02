import java.util.Arrays;

public class merge_sort_array {
    public static void main(String arr[]) {
        int a[] = { 1, 2, 3, 0, 0, 0 };
        int b[] = { 2, 5, 6 };
        int m = 3;
        int n = 3;
        mergesort(a, b, m, n);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] mergesort(int a[], int b[], int m, int n) {
        if (m >= 0) {
            int count = 0;
            for (int i = m; i < m + n; i++) {
                a[i] = b[count];
                count++;
            }
            Arrays.sort(a);
        }
        return a;
    }
}