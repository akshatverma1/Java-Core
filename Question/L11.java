package Question;

public class L11 {
    public static int tappingwater() {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int last = height.length - 1;
        int first = 0;
        // int lastv = height[leg];
        int width = 0;
        int s = 0;
        for (int i = 0; i < height.length; i++) {
            width = last - first;
            if (height[first] <= height[last]) {
                width = width * height[first];
                first = first + 1;
            } else {
                width = width * height[last];
                last = last - 1;
            }
            if (width >= s) {
                s = width;
            }
        }
        System.out.println(s);
        return s;
    }

    public static void main(String arr[]) {
        System.out.println(tappingwater());
    }
}
