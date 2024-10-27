public class Modifiedbubblesort {
    public static void bubblesort(int arr[], int end) {
        for (int i = 0; i < end; i++) {
            Boolean swap = false;
            for (int j = 0; j < end - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap == false) {
                System.out.println("Break Keyword Invoked");
                break;
            }
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String a[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        bubblesort(arr, arr.length - 1);
        print(arr);
    }
}
