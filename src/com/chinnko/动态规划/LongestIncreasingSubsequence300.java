package 动态规划;

import jdk.nashorn.internal.ir.IfNode;

public class LongestIncreasingSubsequence300 {
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
    }

    public static int lengthOfLIS(int[] nums) {
        int[] ints = new int[nums.length];
        int lisLengthl = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            ints[i] = 1;
            for (int j = 0; j < i; j++) {
                int jnum = nums[j];
                if (num > jnum) {
                    ints[i] = Math.max(ints[i], ints[j] + 1);
                }
            }
            lisLengthl = Math.max(lisLengthl, ints[i]);
        }
        return lisLengthl;
    }
}
