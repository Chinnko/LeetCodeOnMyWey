package 动态规划;

public class MaximalSquare221 {
    public static void main(String[] args) {
        char[][] ints = {{'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}};
        System.out.println(maximalSquare(ints));
    }


    public static int maximalSquare(char[][] matrix) {
        int size = 0;
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                char current = matrix[x][y];
                if (current == '1') {
                    if (size == 0) {
                        size = size + 1;
                    } else {
                        if (matrix.length > x + size + 1 && matrix[x].length > y + size + 1) {
                            for (int i = 1; i < size + 1; i++) {
                                char matrix1 = matrix[x][y - i];
                                char matrix2 = matrix[x + i][y];
                                System.out.println("matrix2" + matrix2 + "matrix1:" + matrix1);
                            }
                        }
                    }
                }
            }
        }
        return size;
    }
}
