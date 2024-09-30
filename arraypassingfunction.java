import java.util.*;

public class arraypassingfunction {

    public static void main(String arru[]) {
        int arr[] = { 1, 1, 1 };
        System.out.println("Array Numbers");
        // arr[0] = 122;
        // arr[1] = 123;
        // arr[2] = 124;
        for (int k = 0; k <= arr.length; k++) {
            System.out.println(arr[k]);
        }
        eeeee(arr);

    }

    public static void eeeee(int arr[]) {
        for (int i = 0; i <= arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
        for (int j = 0; j <= arr.length; j++) {
            System.out.println(arr[j]);
        }

    }
}
