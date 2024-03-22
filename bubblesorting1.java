public class bubblesorting1 {
    public static void bubble(int arr[]) {
        int time = 0;
        int end = arr.length - 1;
        for (int i = 0; i < end; i++) {
            for (int j = 0; j < end - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                    time++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("time");
        System.out.println(time);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        bubble(arr);

    }
}
