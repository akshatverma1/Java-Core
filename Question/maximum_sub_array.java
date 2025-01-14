public class maximum_sub_array {
    public static void main(String arr[]) {
        int arrayyy[] = { -1, 0, 1, 2, -1, -4 };
        int width = 3;
        int loopEnd = arrayyy.length - width;
        int target = 10;
        for (int i = 0; i < loopEnd - 1; i++) {
            System.out.println("Outer");
            for (int j = i; j < width; j++) {
                System.out.println("Inner");
            }
        }
    }
}