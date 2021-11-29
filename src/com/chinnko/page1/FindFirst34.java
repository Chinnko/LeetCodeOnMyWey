package page1;

public class FindFirst34 {
    public static void main(String[] args) {
        int[] ints = searchRange(new int[]{1, 4}, 4);
        System.out.println(ints);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ints = new int[]{-1, -1};
        int start = 0, end = nums.length - 1, mod;
        if (nums.length == 0 || nums[end] < target) {
            return ints;
        }
        if (nums.length == 1 && nums[0] == target) {
            ints[0] = 0;
            ints[1] = 0;
            return ints;
        }
        while (start != end) {
            mod = (start + end) / 2;
            int current = nums[mod];
            if (nums[mod] == target) {
                for (int i = start; i < nums.length; i++) {
                    if (nums[i] == target) {
                        ints[0] = ints[0] == -1 ? i : ints[0];
                        ints[1] = i;
                    }
                    if (nums[i] > target || i == nums.length - 1) {
                        return ints;
                    }
                }

            } else if (current > target) {
                end = mod;
            } else if (current < target) {
                start = mod + 1;
            }
            if (start == end) {
                if (nums[start] == target) {
                    ints[0] = start;
                    ints[1] = end;
                }
            }
        }
        return ints;
    }
}
