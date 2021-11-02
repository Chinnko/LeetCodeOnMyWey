package 动态规划;

public class UniquePathsII63 {
    public static void main(String[] args) {
        int[][] ints = new int[3][2];
        ints[0] = new int[]{0, 0};
        ints[1] = new int[]{1, 1};
        ints[2] = new int[]{0, 0};
//        ints[1] = new int[]{0, 1, 0};
//        ints[2] = new int[]{0, 0, 0};
        System.out.println(new UniquePathsII63().uniquePathsWithObstacles(ints));
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int x = obstacleGrid.length;
        int y = obstacleGrid[0].length;
        int[][] ints = new int[x][y];
        if (obstacleGrid[x - 1][y - 1] == 1 || obstacleGrid[0][0] == 1)
            return 0;
        if (x > 1 && y > 1&& obstacleGrid[0][1] == 1 && obstacleGrid[1][0] == 1)
            return 0;
        for (int cx = 0; cx < x; cx++) {
            for (int cy = 0; cy < y; cy++) {
                if (cx == 0 || cy == 0) {
                    if (cx == 0 && cy > 0 && obstacleGrid[cx][cy - 1] == 1) {
                        ints[cx][cy] = 0;
                        continue;
                    }
                    if (cy == 0 && cx > 0 && obstacleGrid[cx - 1][cy] == 1) {
                        ints[cx][cy] = 0;
                        continue;
                    }
                    if (obstacleGrid[cx][cy] != 1) {
                        ints[cx][cy] = 1;
                    }
                } else {
                    if (obstacleGrid[cx][cy] == 1) {
                        ints[cx][cy] = 0;
                        continue;
                    }
                    ints[cx][cy] = ints[cx - 1][cy] + ints[cx][cy - 1];
                }
            }
        }

        return ints[x - 1][y - 1];
    }
}
