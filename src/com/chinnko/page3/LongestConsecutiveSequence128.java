package page3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence128 {

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{1, 2, 300, 4, 6}));
    }


    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> objects = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            objects.add(nums[i]);
        }
        int max = 1;
        for (int num : nums) {
            if (objects.contains(num - 1)) {
                int current = 1;
                while (objects.contains(num + 1)) {
                    current++;
                    num = num + 1;
                }
                max = Math.max(max, current);
            }
        }
        return max;
    }
}
