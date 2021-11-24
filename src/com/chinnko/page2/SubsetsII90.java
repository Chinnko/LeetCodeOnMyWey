import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SubsetsII90 {
    public List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dp(nums, new LinkedList<>(), 0);
        return list;
    }

    public void dp(int[] nums, LinkedList<Integer> curr, int start) {
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i = 0; i < curr.size(); i++) {
            integers.add(nums[curr.get(i)]);
        }
        list.add(integers);

        for (int i = start; i < nums.length; i++) {
            if (list.contains(i)) {
                continue;
            }
            if (start != i && nums[i] == nums[i - 1]) {
                continue;
            }
            curr.add(i);
            dp(nums, curr, i + 1);
            curr.removeLast();
        }
    }

    public static void main(String[] args) {
        SubsetsII90 subsetsII90 = new SubsetsII90();
        List<List<Integer>> lists = subsetsII90.subsetsWithDup(new int[]{1, 1});
        System.out.println(lists.size());
    }
}
