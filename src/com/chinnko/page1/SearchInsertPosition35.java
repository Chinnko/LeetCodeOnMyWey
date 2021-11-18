package page1;

public class SearchInsertPosition35 {
    public static void main(String[] args) {
        System.out.println(new SearchInsertPosition35().searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }
        if (nums[0] > target) {
            return 0;
        }
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                start = mid + 1; // 注意
            else if (nums[mid] > target)
                end = mid - 1; // 注意
        }
        if (nums[start] == target)
            return start;
        if (nums[end] == target)
            return end;
        if (nums[start] > target)
            return start;
        if (nums[end] < target)
            return end;
        return -1;
    }

}
