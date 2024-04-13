public class quicksort {
    public static void print(int arr[]) {
        for (int y = 0; y < arr.length; y++) {
            System.out.print(arr[y] + " ");
        }
    }

    public static void quicksortt(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivotindex = partition(arr, si, ei);
        // left
        quicksortt(arr, si, pivotindex - 1);
        // right
        quicksortt(arr, pivotindex + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                // arr[i] = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        // int temp = pivot;
        // arr[ei] = arr[i];
        // arr[i] = temp;
        return i;
    }

    public static void main(String ar[]) {
        int arr[] = { 6, 8, 3, 5, 2, 9, 1 };
        quicksortt(arr, 0, arr.length - 1);
        print(arr);
    }
}
