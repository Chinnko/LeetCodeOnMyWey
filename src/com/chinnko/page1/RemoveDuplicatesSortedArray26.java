package page1;

public class RemoveDuplicatesSortedArray26 {
    public static void main(String[] args) {
        removeDuplicates(new int[]{1,1,2});
    }

    public  static  int removeDuplicates(int[] nums) {
        int out = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[out]) {
                out++;
                nums[out] = nums[i];

            }
        }
        return out+1;
    }
}
