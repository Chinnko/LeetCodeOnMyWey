package page2;

public class RemoveDuplicatesfromSortedArrayII80 {

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArrayII80 removeDuplicatesfromSortedArrayII80 = new RemoveDuplicatesfromSortedArrayII80();
        removeDuplicatesfromSortedArrayII80.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3});

    }

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2])
                nums[index++] = nums[i];
        }

        return index;
    }
}
