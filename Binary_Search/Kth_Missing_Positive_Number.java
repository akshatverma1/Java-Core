public class Kth_Missing_Positive_Number {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;

        int result = findKthPositive(arr, k);
        System.out.println("Kth missing number is: " + result);
    }

    public static int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;

        // Binary search to find the position
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int missing = arr[mid] - (mid + 1); // count of missing numbers before arr[mid]

            if (missing < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Final answer
        return left + k;
    }
}