import java.util.*;

public class mergeSort {

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void sort(int array[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        sort(array, si, mid);
        sort(array, mid + 1, ei);
        merge(array, si, ei, mid);
    }

    public static void merge(int array[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while ((i <= mid) && (j <= ei)) {
            if (array[i] < array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        // Left Side
        while (i <= mid) {
            temp[k++] = array[i++];
        }

        // right side
        while (j <= ei) {
            temp[k++] = array[j++];
        }
        // copy
        int g = si, h = 0;

        while (h < temp.length) {
            array[g++] = temp[h++];
        }
    }

    public static void main(String arr[]) {
        int array[] = { 9, 2, 5, 7, 2, 4, 7, 1 };
        sort(array, 0, array.length - 1);
        printArray(array);
    }
}