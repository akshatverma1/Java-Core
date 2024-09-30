public class arrayquestion {
    public static void seven(int matrix[][]) {
        int s = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // System.out.print(matrix[i][j]);
                if (matrix[i][j] == 7) {
                    s++;
                }
            }
        }
        System.out.println(s);
    }

    public static void main(String arr[]) {
        int matrix[][] = { { 4, 7, 8 },
                { 8, 8, 7 } };
        seven(matrix);
        System.out.println("tea");
        System.out.println("Vehicles");
        System.err.println("Error in Website");
    }
}
