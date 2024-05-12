public class backtracking2 {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void backtracking(int n, int i, int arr[]) {
        if (i == arr.length) {
            return;
        }
        arr[i] = n;
        backtracking(n + 1, i + 1, arr);
        arr[i] = arr[i] - 2;
    }

    public static void main(String a[]) {
        int arr[] = new int[5];
        backtracking(1, 0, arr);
        print(arr);
    }
}
