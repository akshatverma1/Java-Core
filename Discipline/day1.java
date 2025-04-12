import java.util.*;

public class day1 {
    public static void main(String arr[]) {
        int array2[] = { 12, 35, 1, 10, 34, 1 };
        int array[] = { 23, 54, 12, 33, 11, 2, 4, 6, 23 };
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        // print(array);
        System.out.println(getSecondLargest(array2));
    }

    public static void print(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int getSecondLargest(int[] arr) {
        int len = arr.length - 1;
        for (int i = 0; i <= len; i++) {
            for (int j = i + 1; j <= len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(arr);
        if (arr[len - 2] == arr[len - 1]) {
            return -1;
        }
        return arr[arr.length - 2];
    }
}