public class DSASHEETQ1 {
    public static void keys(int arrr[]) {
        for (int i = 0; i < arrr.length; i++) {
            if (arrr[i] == 2) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String arr[]) {
        int arrr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        keys(arrr);
    }
}
