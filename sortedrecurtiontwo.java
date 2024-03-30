public class sortedrecurtiontwo {
    public static boolean recursive(int arr[], int z) {
        if (z == arr.length - 1) {
            return true;
        }
        if (arr[z] > arr[z + 1]) {
            return false;
        }
        return recursive(arr, z + 1);
    }

    public static void main(String a[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(recursive(arr, 0));
    }
}
