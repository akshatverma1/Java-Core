import java.util.*;

public class subarray {
    public static void main(String arr[]) {
        int arrays[] = { 3, -4, 5, 4, -1, 7, -8 };
        int count = 0;
        int arrayl = arrays.length;
        int maxsum = Integer.MIN_VALUE;
        int sumInt = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i; j < arrays.length; j++) {
                for (int k = i; k <= j; k++) {
                    sumInt = sumInt + arrays[k];
                    if (sumInt >= maxsum)
                        maxsum = sumInt;

                    System.out.print(arrays[k]);
                }
                sumInt = 0;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(maximunsubarray(arrays));
    }

    public static int maximunsubarray(int nums[]) {
        int maxSub = Integer.MIN_VALUE, currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum >= maxSub)
                maxSub = currentSum;
            if (currentSum < 0)
                currentSum = 0;
        }
        return maxSub;
    }
}