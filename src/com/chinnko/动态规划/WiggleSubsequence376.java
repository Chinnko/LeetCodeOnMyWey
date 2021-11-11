package 动态规划;

public class WiggleSubsequence376 {
    public static void main(String[] args) {
        wiggleMaxLength(new int[]{1, 7, 4, 9, 2, 5});
    }

    public static int wiggleMaxLength(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return length;
        }
        int top = 1, bottom = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                top = bottom + 1;
            }
            if (nums[i] < nums[i - 1]) {
                bottom = top + 1;
            }
        }
        return Math.max(top, bottom);
    }

}
