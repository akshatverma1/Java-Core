import java.util.*;

public class L15 {
    public static void main(String arr[]) {
        int arrayy[] = { -1, 0, 1, 2, -1, -4 };

        ArrayList<String> arrr = new ArrayList<>();

        for (int i = 0; i < arrayy.length; i++) {
            for (int j = i + 1; j < arrayy.length; j++) {
                for (int k = j + 1; k < arrayy.length; k++) {
                    if (arrayy[i] + arrayy[j] + arrayy[k] == 0) {
                        System.out.println(arrayy[i] + " " + arrayy[j] + " " + arrayy[k]);
                        arrr.add("[" + arrayy[i] + "," + arrayy[j] + "," + arrayy[k] + "]");
                    }
                }
            }
        }
        System.out.println(arrr);
    }
}