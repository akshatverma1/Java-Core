public class springmatrix {
    public static void spring(int matrix[][]) {
        System.out.println(matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            // System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
                { 17, 18, 19, 20 } };
        spring(matrix);
    }
}