package Sorting;

public class selection_sort {
    public static void selection(int arayyy[]) {
        for (int i = 0; i < arayyy.length; i++) {
            for (int j = (i + 1); j < arayyy.length; j++) {
                if (arayyy[i] >= arayyy[j]) {
                    int temp = arayyy[i];
                    arayyy[i] = arayyy[j];
                    arayyy[j] = temp;
                }
            }
            System.out.print(arayyy[i] + " ");
        }
    }

    public static void main(String[] arrr) {
        int arayyy[] = { 4, 2, 1, 5, 6, 2 };
        selection(arayyy);
    }
}
