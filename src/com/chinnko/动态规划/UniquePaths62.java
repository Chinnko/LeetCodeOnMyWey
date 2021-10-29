package 动态规划;

public class UniquePaths62 {

    public static void main(String[] args) {
        System.out.println(new UniquePaths62().uniquePaths(3, 2));
    }

    public int uniquePaths(int m, int n) {
        int[][] ints = new int[m][n];
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (x == 0 || y == 0) {
                    ints[x][y] = 1;
                } else {
                    ints[x][y] = ints[x - 1][y] + ints[x][y - 1];
                }
            }
        }
        return ints[m - 1][n - 1];
    }


}
