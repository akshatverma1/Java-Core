package Question;

public class L11 {
    public static void main(String arr[]) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int max = 0;
        int count = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                count = count + 1;
                int originalHeight = 0;
                if (height[i] > height[j]) {
                    originalHeight = height[j];
                } else {
                    originalHeight = height[i];
                }
                int max1 = count * originalHeight;
                if (max1 > max) {
                    max = max1;
                }
            }
        }
        System.out.println(max);
    }
}
