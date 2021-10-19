package 动态规划;

public class MinCostClimbingStairs746 {
    public static void main(String[] args) {
        System.out.println(new MinCostClimbingStairs746().minCostClimbingStairs(new int[]{10, 15, 20}));
    }

    public int minCostClimbingStairs(int[] cost) {
        Integer[] maps = new Integer[cost.length];
        maps[0] = cost[0];
        maps[1] = cost[1];
        for (int num = 2; num < cost.length; num++) {
            maps[num] = Math.min(maps[num - 1], maps[num - 2]) + cost[num];
        }
        return Math.min(maps[cost.length - 1], maps[cost.length - 2]);
    }
}
