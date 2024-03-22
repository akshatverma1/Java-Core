public class bubblesort {
    public static void main(String ar[]) {
        int swap;
        int arrrayy[] = { 5, 4, 1, 3, 2 };
        for (int i = 0; i < arrrayy.length - 1; i++) {
            for (int j = 0; j < arrrayy.length - 1 - i; j++) {
                if (arrrayy[i] > arrrayy[j + 1]) {
                    swap = arrrayy[j];
                    arrrayy[i] = arrrayy[j + 1];
                    arrrayy[j + 1] = swap;
                }
            }

        }

        for (int i = 0; i < arrrayy.length; i++) {
            System.out.println(arrrayy[i]);
        }
    }
}