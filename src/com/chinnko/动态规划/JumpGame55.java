package 动态规划;

public class JumpGame55 {
    public static void main(String[] args) {
        System.out.println(new JumpGame55().canJump(new int[]{2, 3, 1, 1, 4}));
    }

    public boolean canJump(int[] nums) {
        int dis = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > dis) {
                return false;
            }
            dis = Math.max(i + nums[i], dis);
        }
        return true;
    }


}
