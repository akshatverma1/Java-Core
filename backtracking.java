public class backtracking {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void backtrack(int arr[], int si, int valueindex) {
        if (si == arr.length) {
            return;
        }
        arr[si] = valueindex;
        backtrack(arr, si + 1, valueindex + 1);
        arr[si] = valueindex - 2;
    }

    public static void main(String a[]) {
        int arr[] = new int[6];
        backtrack(arr, 0, 1);
        print(arr);
    }
}