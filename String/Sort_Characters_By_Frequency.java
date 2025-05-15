package String;

import java.util.*;;

public class Sort_Characters_By_Frequency {
    public static void main(String arr[]) {
        String str = "Aabb";
        System.out.println(frequency(str));
    }

    public static String frequency(String str) {
        int fre[] = new int[128];
        StringBuilder strB = new StringBuilder("");
        Arrays.fill(fre, 0);
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            fre[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < fre.length; j++) {
                if (max < fre[j]) {
                    max = fre[j];
                    index = j;
                }
            }
            for (int j = 1; j <= max; j++) {
                char a = (char) index;
                strB.append(a);
            }
            fre[index] = 0;
            max = 0;
        }
        return strB.toString();

    }
}
