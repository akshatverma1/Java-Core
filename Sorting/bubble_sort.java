package Sorting;

public class bubble_sort {
    public static void main(String[] aa) {
        System.out.println("Bubble Sort");
        int arrayy[] = { 5, 4, 2, 8, 6 };

        for (int i = 0; i < arrayy.length; i++) {
            for (int j = 0; j < arrayy.length - 1; j++) {

                if (arrayy[j] > arrayy[j + 1]) {
                    int k = arrayy[j];
                    arrayy[j] = arrayy[j + 1];
                    arrayy[j + 1] = k;
                }

            }
        }
        for (int i = 0; i < arrayy.length; i++) {
            System.out.print(arrayy[i] + " ");
        }

    }
}
