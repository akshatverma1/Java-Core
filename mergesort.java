public class mergesort {
    public static void fun(int arr[]) {
        for (int u = 0; u < arr.length; u++) {
            System.out.print(arr[u] + " ");
        }
    }

    public static void merge(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + (ei - si) / 2);
        // left
        merge(arr, si, mid);
        // right
        merge(arr, mid + 1, ei);
        // for merge both array
        merge(arr, si, ei, mid);
    }

    public static void merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while ((i <= mid) && (j <= ei)) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (int w = 0, q = si; w < temp.length; q++, w++) {
            arr[q] = temp[w];
        }
    }

    public static void main(String a[]) {
        int arr[] = { 1, 5, 7, 2, 8, 3 };
        merge(arr, 0, arr.length - 1);
        fun(arr);
    }
}