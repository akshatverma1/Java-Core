public class selectionsort {
    public static void ss(int arr[]) {
        int small = 0;
        for (int i = 0; i < arr.length; i++) {

            if ((small >= arr[i])) {
                small = arr[i];
            }
        }
        System.out.println(small);
    }

    public static void main(String a[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        ss(arr);
    }
}
