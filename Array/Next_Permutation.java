import java.util.*;

public class Next_Permutation {
    public static void main(String arr[]) {
        int arrray[] = { 3, 2, 1 };
        permutation(arrray);
        for (int i = 0; i < arrray.length; i++) {
            System.out.println(arrray[i]);
        }
    }

    public static int[] permutation(int arrray[]) {
        int i = arrray.length - 2;
        while ((i >= 0) && (arrray[i] >= arrray[i + 1])) {
            i--;
        }
        int j = arrray.length - 1;
        if (i >= 0) {

            while (arrray[i] >= arrray[j]) {
                j--;
            }
            int temp = arrray[i];
            arrray[i] = arrray[j];
            arrray[j] = temp;

            System.out.println(i + " " + j);

        }
        i++;
        j = arrray.length - 1;
        while (i < j) {
            int tempp = arrray[i];
            arrray[i] = arrray[j];
            arrray[j] = tempp;
            i++;
            j--;
        }
        return arrray;
    }
}
