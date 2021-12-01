package page1;

import java.util.Arrays;

public class NextPermutation31 {
    public static void main(String[] args) {
        nextPermutation(new int[]{1, 3,2});
    }

    public static void nextPermutation(int[] nums) {
        if (nums.length == 1)
            return;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                for (int j = nums.length-1; j > i; j--) {
                    if (nums[i] < nums[j]) {
                        int current = nums[i];
                        nums[i] = nums[j];
                        nums[j] = current;
                        break;
                    }
                }
                Arrays.sort(nums, i + 1, nums.length);
                return;
            }
        }
        Arrays.sort(nums);
    }
}
