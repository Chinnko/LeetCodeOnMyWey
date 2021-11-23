package 动态规划;

import java.lang.reflect.Array;
import java.util.Arrays;

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
        int[][] ints = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < ints.length; i++) {
            int[] current = obstacleGrid[i];
            for (int i1 = 0; i1 < current.length; i1++) {
                int pos = current[i1];
                if (pos == 1) {
                    ints[i][i1] = 0;
                    continue;
                }
                if (i == 0 && i1 == 0) {
                    ints[i][i1] = 1;
                    continue;
                }
                if (i == 0) {
                    ints[i][i1] = i1 - 1 >= 0 && ints[i][i1 - 1] != 0 ? 1 : 0;
                    continue;
                }
                if (i1 == 0) {
                    ints[i][i1] = i - 1 >= 0 && ints[i - 1][i1] != 0 ? 1 : 0;
                    continue;
                }
                ints[i][i1] = ints[i - 1][i1] + ints[i][i1 - 1];
            }
        }
        return ints[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
