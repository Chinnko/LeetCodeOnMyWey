package page1;

import java.util.ArrayList;
import java.util.List;

public class Permutations46 {
    public static void main(String[] args) {
        System.out.println(new Permutations46().permute(new int[]{0, 1}));
    }

    public ArrayList<List<Integer>> objects = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        pr(new ArrayList<>(), nums);
        return objects;
    }

    public void pr(List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            objects.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            pr(list, nums);
            list.remove(list.size() - 1);
        }
    }
}
