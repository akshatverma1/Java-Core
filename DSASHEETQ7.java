public class DSASHEETQ7 {
    public static void print(int arr[]) {
        for (int u = 0; u < arr.length; u++) {
            System.out.print(arr[u] + " ");
        }
    }

    public static void mergesort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }
        int mid = (si + (ei - si) / 2);
        // left
        mergesort(arr, si, mid);
        // right
        mergesort(arr, mid + 1, ei);
        // for merge both function
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int t = 0;
        int i = si;
        int j = mid + 1;
        for (; (i <= mid) && (j <= ei);) {
            if (arr[i] < arr[j]) {
                temp[t] = arr[i];
                i++;
            } else {
                temp[t] = arr[j];
                j++;
            }
            t++;
        }
        for (; (i <= mid);) {
            temp[t++] = arr[i++];
        }
        for (; (j <= ei);) {
            temp[t++] = arr[j++];
        }
        // copy
        for (int r = si, o = 0; o < temp.length; r++, o++) {
            arr[r] = temp[o];
        }
    }

    public static void main(String ar[]) {
        int arr[] = { 2, 6, 4, 9, 3, 1 };
        mergesort(arr, 0, arr.length - 1);
        print(arr);
    }
}
