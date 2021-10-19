package 动态规划;

import java.util.HashMap;

public class HouseRobber198 {
    public static void main(String[] args) {
        System.out.println(new HouseRobber198().rob());
    }

    public HashMap<Integer, Integer> cache = new HashMap<>();

    public int rob() {
        return Math.max(jut(new int[]{2, 7, 9, 3, 1}, 0), jut(new int[]{2, 7, 9, 3, 1}, 1));
    }


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
