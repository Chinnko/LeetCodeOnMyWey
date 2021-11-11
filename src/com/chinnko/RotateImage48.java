public class RotateImage48 {
    public static void main(String[] args) {
        int[][] ints = new int[3][3];
        ints[0] = new int[]{1, 2, 3};
        ints[1] = new int[]{4, 5, 6};
        ints[2] = new int[]{7, 8, 9};
        rotate(ints);
        System.out.println(ints);
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;

            }
        }
    }

}