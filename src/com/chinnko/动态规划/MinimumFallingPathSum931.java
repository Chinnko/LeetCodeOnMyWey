package 动态规划;

public class MinimumFallingPathSum931 {
    public static void main(String[] args) {

    }

    public int minFallingPathSum(int[][] matrix) {
        int outPut = Integer.MAX_VALUE;
        if (matrix.length == 1) {
            for (int i : matrix[0]) {
                outPut = Math.min(outPut, i);
            }
            return outPut;
        }
        for (int a = 1; a < matrix.length; a++) {
            for (int i1 = 0; i1 < matrix[a].length; i1++) {
                int minNumber = 0;
                if (i1 == 0) {
                    minNumber = Math.min(matrix[a - 1][i1], matrix[a - 1][i1 + 1]);
                } else if (i1 == matrix[a].length - 1) {
                    minNumber = Math.min(matrix[a - 1][i1 - 1], matrix[a - 1][i1]);
                } else {
                    minNumber = Math.min(matrix[a - 1][i1 - 1], matrix[a - 1][i1]);
                    minNumber = Math.min(matrix[a - 1][i1 + 1], minNumber);
                }
                matrix[a][i1] = matrix[a][i1] + minNumber;
                if (a == matrix.length - 1) {
                    outPut = Math.min(matrix[a][i1], outPut);
                }
            }
        }
        return outPut;
    }

}
