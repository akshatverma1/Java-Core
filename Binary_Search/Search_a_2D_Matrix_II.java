public class Search_a_2D_Matrix_II {
    public static void main(String arr[]) {
        int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        int target = 20;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        while (i < matrix.length) {
            int si = 0;
            int ei = matrix[i].length - 1;
            int mid = si + (ei - si) / 2;
            while (si <= ei) {
                if (matrix[i][mid] == target) {
                    return true;
                } else if (matrix[i][mid] > target) {
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }
                mid = si + (ei - si) / 2;
            }
            i++;
        }
        return false;
    }
}
