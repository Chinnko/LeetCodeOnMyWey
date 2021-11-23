package page2;

public class SetMatrixZeroes73 {
    public static void main(String[] args) {
        SetMatrixZeroes73 setMatrixZeroes73 = new SetMatrixZeroes73();
        int[][] ints = new int[3][3];
        ints[0] = new int[]{0, 1, 2, 0};
        ints[1] = new int[]{3, 4, 5, 2};
        ints[2] = new int[]{1, 3, 1, 5};
        setMatrixZeroes73.setZeroes(ints);
        System.out.println(ints);
    }

    public void setZeroes(int[][] matrix) {
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                if (matrix[x][y] == 0) {
                    for (int x1 = 0; x1 < matrix.length; x1++) {
                        if (x == x1 || matrix[x1][y] == 0) {
                            continue;
                        }
                        matrix[x1][y] = "XXXX——xxx".hashCode();
                    }
                    for (int y2 = 0; y2 < matrix[x].length; y2++) {
                        if (y2 == y || matrix[x][y2] == 0) {
                            continue;
                        }
                        matrix[x][y2] ="XXXX——xxx".hashCode();
                    }
                }
            }
        }
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                if (matrix[x][y] == "XXXX——xxx".hashCode()) {
                    matrix[x][y] = 0;
                }
            }
        }
    }


}
