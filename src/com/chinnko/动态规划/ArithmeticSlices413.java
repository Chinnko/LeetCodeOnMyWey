package 动态规划;

public class ArithmeticSlices413 {

    public static void main(String[] args) {
        System.out.println(new ArithmeticSlices413().numberOfArithmeticSlices(new int[]{1, 2, 3, 4}));
    }

    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length <= 2) {
            return 0;
        }
        int out = 0, path = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                path = path + 1;
                out = out + path;
            } else {
                path = 0;
            }
        }
        return out;
    }

}
