package Question;

public class L11 {
    public static int tappingwater() {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int max = 0;
        int count = 1;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                count = count + 1;
                int max1 = 0;
                if (height[i] > height[j]) {
                    max1 = count * height[j];
                } else {
                    max1 = count * height[i];
                }
                if (max1 > max) {
                    max = max1;
                }
            }
        }
        return max;
    }

    public static void main(String arr[]) {
        System.out.println(tappingwater());
    }
}
