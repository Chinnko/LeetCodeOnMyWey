import java.lang.reflect.Array;
import java.util.Arrays;

public class NextPermutation31 {
    public static void main(String[] args) {
        nextPermutation(new int[]{1, 3, 2});
        String str1 = "a" + "b";
        String str2 = new String("a") + new String("b");
        System.out.println(str1 == str2);
    }

    public static void nextPermutation(int[] nums) {
        if (nums.length == 1) {
            return;
        } else if (nums.length == 2) {
            int num = nums[0];
            int num1 = nums[1];
            if (num < num1) {
                nums[1] = nums[0];
                nums[0] = num1;
            }
            return;
        } else {
            for (int i = nums.length - 2; i > 0; i--) {
                if (nums[i] < nums[i + 1]) {
                    int current = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = current;
                    return;
                }
            }
        }

        Arrays.sort(nums);
    }
}
