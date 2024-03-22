import java.util.Arrays;
import java.util.Collections;

public class inbuilt {
    public static void sortarraymethod(Integer arr[]) {
        System.out.println("Normal Sort");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortarraywithstartend(Integer arr[], int Start, int end) {
        Arrays.sort(arr, Start, end);
        System.out.println();
        System.out.println("Normal sort with start & end");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void forreverse(Integer arr[]) {
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println();
        System.out.println("reverse");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void forreversewithstartend(Integer arr[], int s, int d) {
        Arrays.sort(arr, s, d, Collections.reverseOrder());
        System.out.println();
        System.out.println("reversewithstartend");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        sortarraymethod(arr);
        forreverse(arr);
        sortarraywithstartend(arr, 2, 5);
        forreversewithstartend(arr, 1, 5);
    }
}
