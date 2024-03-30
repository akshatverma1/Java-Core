public class keyrecursion {
    public static int firstoccurance(int arr[], int key, int i) {
        if (arr[i] == key) {
            return i;
        }
        return firstoccurance(arr, key, i + 1);
    }

    public static void main(String ar[]) {
        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println(firstoccurance(arr, 3, 0));
    }
}
