package 五十;

public class RemoveElement27 {
    public static void main(String[] args) {

    }

    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return 0;
        int out = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[out] = nums[i];
                out++;
            }
        }
        return out;

    }
}
