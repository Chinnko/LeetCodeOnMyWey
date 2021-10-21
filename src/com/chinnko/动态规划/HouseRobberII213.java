package 动态规划;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class HouseRobberII213 {

    public static void main(String[] args) {
        System.out.println(new HouseRobberII213().rob(new int[]{1, 2, 1, 1}));
    }


    public int rob(int[] nums) {
        if (nums.length <= 3) {
            int max = Integer.MIN_VALUE;
            for (int num : nums) {
                max = Math.max(num, max);
            }
            return max;
        }
        return Math.max(jut(Arrays.copyOfRange(nums, 0, nums.length - 1), 0), jut(nums, 1));
    }

    public HashMap<Integer, Integer> cache = new HashMap<>();

    public int jut(int[] nums, int point) {
        if (point > nums.length - 1) {
            return 0;
        }
        int pos2 = point + 2;
        int pos3 = point + 3;
        if (cache.get(pos2) == null) {
            cache.put(pos2, jut(nums, pos2));
        }
        if (cache.get(pos3) == null) {
            cache.put(pos3, jut(nums, pos3));
        }
        Integer p2 = cache.get(pos2);
        Integer p3 = cache.get(pos3);
        return Math.max(p2, p3) + nums[point];
    }
}
