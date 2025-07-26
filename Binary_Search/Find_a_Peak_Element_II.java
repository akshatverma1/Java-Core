public class Find_a_Peak_Element_II {
    public static void main(String arr[]) {
        int[][] mat = { { 1, 4 }, { 3, 2 } };
        int arrr[] = findPeakGrid(mat);
        for (int i = 0; i < arrr.length; i++) {
            System.out.println(arrr[i]);
        }
    }

    public static int maxrow(int mat[][], int n, int m, int col) {
        int index = -1;
        int maxValue = -1;
        for (int i = 0; i < n; i++) {
            if (mat[i][col] > maxValue) {
                maxValue = mat[i][col];
                index = i;
            }
        }
        return index;
    }

    public static int[] findPeakGrid(int[][] mat) {
        System.out.println("ex");
        int result[] = { -1, -1 };
        int n = mat.length;
        int m = mat[0].length;
        int si = 0;
        int ei = mat[0].length - 1;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            int maxrowindex = maxrow(mat, n, m, mid);
            int left = mid - 1 >= 0 ? mat[maxrowindex][mid - 1] : -1;
            int right = mid + 1 < m ? mat[maxrowindex][mid + 1] : -1;
            if (left < mat[maxrowindex][mid] && mat[maxrowindex][mid] > right) {
                result[0] = maxrowindex;
                result[1] = mid;
                return result;
            } else if (mat[maxrowindex][mid] < left) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return result;
    }
}