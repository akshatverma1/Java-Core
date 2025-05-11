package Patterns;

public class sliding_window_technique {
    public static void main(String arr[]) {
        int array[] = { 3, 8, 2, 5, 7, 6, 12 };
        int suba = 4;
        int ei = array.length - suba;
        int maxSub = 0;
        int FinalSub = Integer.MIN_VALUE;
        for (int i = 0; i <= ei; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i + j] + " ");
                maxSub += array[i + j];
            }
            if (maxSub >= FinalSub) {
                FinalSub = maxSub;
            }
            maxSub = 0;
            System.out.println();
        }
        System.out.println(FinalSub);
    }
}