import java.math.*;
import java.util.*;

public class cooridanetesquestion {
    public static void main(String[] args) {
        float x1 = 0, x2 = 0;
        float y1 = 0, y2 = 0;
        String str = "WNEENESENNN";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y2 = y2 + 1;
            } else if (str.charAt(i) == 'S') {
                y2 = y2 - 1;
            } else if (str.charAt(i) == 'E') {
                x2 = x2 + 1;
            } else if (str.charAt(i) == 'W') {
                x2 = x2 - 1;
            }
        }
        y2 = (y2 * y2);
        x2 = (x2 * x2);
        float x = (float) Math.sqrt(x2 + y2);
        System.out.println(x);
    }
}
