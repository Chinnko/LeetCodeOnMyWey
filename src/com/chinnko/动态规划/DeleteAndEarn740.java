package 动态规划;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DeleteAndEarn740 {
    public static void main(String[] args) {
        System.out.println(new DeleteAndEarn740().deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4}));
    }

    public int deleteAndEarn(int[] nums) {
        int count = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int[] ints = Arrays.copyOf(nums, nums.length);
            ints[i] = -1;
            int earn = earn(ints, 0, nums[i]);
            count = Math.max(earn, count);
        }
        return count;
    }

    public int earn(int[] nums, int position, int curr) {
        if (position > nums.length - 1) {
            return 0;
        }
        if (curr == -1) {
            return 0;
        }
        int count = curr;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == curr + 1 || nums[i] == curr - 1) {
                nums[i] = -1;
                continue;
            }
            if (curr != -1 && nums[i] == curr) {
                count = count + curr;
                nums[i] = -1;
            }
        }
        if (position == nums.length - 1) {
            return count;
        }
        int num = -1;
        for (int i = position + 1; i < nums.length; i++) {
            if (nums[i] != -1) {
                num = nums[i];
                nums[i] = -1;
            }
        }
        return earn(nums, position + 1, num) + count + num;
    }
}
