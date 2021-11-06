package 动态规划;

public class MinimumPathSum64 {
    public static void main(String[] args) {
        int[][] ints = new int[3][3];
        ints[0] = new int[]{1, 3, 1};
        ints[1] = new int[]{1, 5, 1};
        ints[2] = new int[]{4, 2, 1};
        System.out.println(minPathSum(ints));
    }

    public static int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0) {
                    grid[i][j] = grid[i][j] + grid[i][j - 1];
                    continue;
                }
                if (j == 0) {
                    grid[i][j] = grid[i][j] + grid[i - 1][j];
                    continue;
                }
                grid[i][j] = grid[i][j] + Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}
