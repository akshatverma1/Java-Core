/*Question 2 :You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.  
Use a recursive function to solve this problem.
NOTE-Thedigitsofthenumberwillonlybeintherange0-9andthelastdigitofanumbercan’t be 0.
Sample Input: 1947Sample Output: “one nine four seven”*/
public class DSASHEETQ2 {
    public static void converter_no_to_string(int arr[], int n) {
        if (n == arr.length) {
            return;
        } else if (arr[n] == 0) {
            System.out.print("Zero ");
        } else if (arr[n] == 1) {
            System.out.print("One ");
        } else if (arr[n] == 2) {
            System.out.print("Two ");
        } else if (arr[n] == 3) {
            System.out.print("Three ");
        } else if (arr[n] == 4) {
            System.out.print("Four ");
        } else if (arr[n] == 5) {
            System.out.print("Five ");
        } else if (arr[n] == 6) {
            System.out.print("Six ");
        } else if (arr[n] == 7) {
            System.out.print("Seven ");
        } else if (arr[n] == 8) {
            System.out.print("Eight ");
        } else if (arr[n] == 9) {
            System.out.print("Nine ");
        }
        converter_no_to_string(arr, n + 1);
    }

    public static void main(String a[]) {
        int arr[] = { 1, 9, 4, 7 };
        int n = arr.length - 1;
        converter_no_to_string(arr, 0);
    }
}
