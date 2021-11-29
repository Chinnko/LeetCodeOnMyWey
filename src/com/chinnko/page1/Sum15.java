package page1;

import java.util.*;

public class Sum15 {
    //    给你一个包含 n 个整数的数组nums，判断nums中是否存在三个元素 a，b，c ，使得a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
//    注意：答案中不可以包含重复的三元组。
    public static void main(String[] args) {
        int[] ints = {0, 0, 0, 0};
        System.out.println(new Sum15().threeSum(ints));
    }

    public List<List<Integer>> listList = new ArrayList<>();


    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> listList = new ArrayList<>();
        HashMap<Integer, Integer> objectObjectHashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            objectObjectHashMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 1 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                Integer integer = objectObjectHashMap.get(-(nums[i] + nums[i1]));
                if (integer != null && integer > i1) {
                    ArrayList<Integer> objects = new ArrayList<>();
                    objects.add(nums[i]);
                    objects.add(nums[i1]);
                    objects.add(-(nums[i] + nums[i1]));
                    if (!listList.contains(objects)) {
                        listList.add(objects);
                    }
                }

            }
        }
        return listList;
    }


//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        threeSum(new LinkedList<>(), nums, 0);
//        return listList;
//    }

//回溯超时
//    public void threeSum(LinkedList<Integer> integers, int[] nums, int x) {
//        if (integers.size() > 3) {
//            return;
//        }
//        if (integers.size() == 3) {
//            int out = 0;
//            for (Integer integer : integers) {
//                out = out + integer;
//            }
//            if (out != 0) {
//                return;
//            }
//            for (List<Integer> integerList : listList) {
//                if (integerList.equals(integers)) {
//                    return;
//                }
//            }
//            listList.add(new ArrayList<>(integers));
//            return;
//        }
//        for (int i = x; i < nums.length; i++) {
//            integers.add(nums[i]);
//            threeSum(integers, nums, i + 1);
//            integers.removeLast();
//        }
//
//    }
}
