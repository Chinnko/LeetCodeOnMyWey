package page1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sum15 {
    //    给你一个包含 n 个整数的数组nums，判断nums中是否存在三个元素 a，b，c ，使得a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
//    注意：答案中不可以包含重复的三元组。
    public static void main(String[] args) {
        System.out.println(new Sum15().threeSum(new int[]{-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6}));
    }

    public List<List<Integer>> listList = new ArrayList<>();


    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        threeSum(new LinkedList<>(), nums, 0);
        return listList;
    }


    public void threeSum(LinkedList<Integer> integers, int[] nums, int x) {
        if (integers.size() > 3) {
            return;
        }
        if (integers.size() == 3) {
            int out = 0;
            for (Integer integer : integers) {
                out = out + integer;
            }
            if (out != 0) {
                return;
            }
            for (List<Integer> integerList : listList) {
                if (integerList.equals(integers)) {
                    return;
                }
            }
            listList.add(new ArrayList<>(integers));
            return;
        }

        for (int i = x; i < nums.length; i++) {
            integers.add(nums[i]);
            threeSum(integers, nums, i + 1);
            integers.removeLast();
        }

    }
}
