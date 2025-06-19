public class Sort_Colors {
    public static void main(String arr[]) {
        int array[] = { 2, 0, 2, 1, 1, 0 };
        sortColor(array);
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }

    public static int[] sortColor(int array[]) {
        for (int i = 0; i < array.length; i++) {
            // for (int j = i + 1; j < array.length; j++) {
            // if (array[i] > array[j]) {
            // int temp = array[i];
            // array[i] = array[j];
            // array[j] = temp;
            // }
            // }
        }
        return array;
    }
}
