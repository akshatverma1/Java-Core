package Sorting;

public class kadane_algorithms {
    // if a number is negative then so we take zero. ex: int q=-1 then q=0;
    public static void main(String[] arr) {
        System.out.println("Kadane Algorithms");

        int arrayy[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int currentsum = 0;
        int maxsum = 0;
        for (int i = 0; i < arrayy.length; i++) {

            currentsum = currentsum + arrayy[i];
            if (currentsum < 0) {
                currentsum = 0;
            }
            if (currentsum > maxsum) {
                maxsum = currentsum;
            }
            System.out.print(arrayy[i] + ",");
        }
        System.out.println();
        System.out.println(currentsum);
        System.out.println(maxsum);
    }
}
