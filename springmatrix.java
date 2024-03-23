public class springmatrix {
    public static void spring(int matrix[][]) {
        int j;
        int i = 0;
        int m = 0;
        int a = 1;
        int b = 0;
        int k = (matrix[0].length) - a;
        int u = 1;
        int y = 2;
        int d = 0;
        int e = matrix.length - u;
        int o = 2;
        int o1 = 0;
        for (int round = 0; round < 2; round++) {
            for (j = 0; j < (matrix[0].length - m); j++) {
                System.out.print(matrix[i][j] + " ");
            }
            for (int z = 1; z < (matrix.length - b); z++) {
                System.out.print(matrix[z][k] + " ");
            }

            for (int g = (matrix[0].length - y); g >= d; g--) {
                System.out.print(matrix[e][g] + " ");
            }

            for (int p = (matrix.length - o); p > o1; p--) {
                System.out.print(matrix[p][o1] + " ");
            }
            i++;
            m = m + 2;
            a++;
            b++;
            u++;
            y++;
            d++;
            o++;
            o1++;
        }

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        spring(matrix);
    }
}