package Sorting;

public class insertion_sort {
    public static void main(String[] arr) {
        int array[] = { 3, 5, 1, 7, 9, 2 };
        int index = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    index = j + 1;
                }
            }
            for (int k = index; k < array.length; k++) {
                for (int u = k; u < array.length; u++) {
                    if (min < array[u]) {
                        min = array[u];
                        int y = 4;
                        int e = 54;
                        int g = 78;
                    }
                }
            }

        }
        System.out.println(min);
    }
}
