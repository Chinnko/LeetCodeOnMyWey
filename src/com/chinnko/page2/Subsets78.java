package page2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets78 {
    public static void main(String[] args) {
        List<List<Integer>> subsets = subsets(new int[]{1, 2, 3});
        System.out.println(subsets);
    }

    public static List<List<Integer>> arrays = new ArrayList<>();

    public static List<List<Integer>> subsets(int[] nums) {

        dp(new LinkedList<>(), nums, 0);
        return arrays;

    }

    public static void dp(LinkedList<Integer> integers, int[] nums, int pos) {
        if (integers.size() > nums.length) {
            return;
        }
        arrays.add(new LinkedList<>(integers));
        for (int i = pos; i < nums.length; i++) {
            integers.add(nums[i]);
            dp(integers, nums, i+1);
            integers.removeLast();
        }

    }
}
