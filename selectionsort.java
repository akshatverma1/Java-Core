public class selectionsort {
    public static void ss(int arr[]) {
        for (int j = 0; j < arr.length; j++) {
            int small = arr[j];
            for (int i = j; i < arr.length; i++) {
                if (small >= arr[i]) {
                    int temp = small;
                    small = arr[i];
                    arr[i] = temp;
                }
            }
            arr[j] = small;
        }
        for (int h = 0; h < arr.length; h++) {
            System.out.println(arr[h]);
        }
    }

    public static void main(String a[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        ss(arr);
    }
}