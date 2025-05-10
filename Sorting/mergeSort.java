import java.util.*;

public class mergeSort {

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String arr[]) {
        int array[] = { 9, 2, 5, 7, 2, 4, 7, 1 };
        printArray(array);
    }
}