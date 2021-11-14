package 五十;

public class TwoSum {

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] outPuts = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int end = target - nums[i];
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                if (nums[i1] == end) {
                    outPuts[0] = i;
                    outPuts[1] = i1;
                    return outPuts;

                }
            }
        }
        return outPuts;

    }
}
