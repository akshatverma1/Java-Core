//For a given integer array of size N.You have to find all the occurrences(indices)
//of a given element(Key) and print them.
//Use a recursive function to solve this problem.
public class DSASHEETQ1 {
    public static int keys(int arrr[], int u, int key) {
        if (u < 0) {
            return 1;
        }
        if (arrr[u] == key) {
            System.out.println(u);
        }
        keys(arrr, u - 1, key);
        return 0;
    }

    public static void main(String arr[]) {
        int arrr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        int y = arrr.length - 1;
        keys(arrr, y, key);
    }
}