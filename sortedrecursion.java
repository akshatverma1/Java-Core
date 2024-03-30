public class sortedrecursion {
    public static void akshat(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            // int small = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
            // arr[i] = small;
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 2, 7 };
        akshat(arr);

    }
}