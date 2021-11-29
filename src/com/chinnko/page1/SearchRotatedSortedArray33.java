package page1;

public class SearchRotatedSortedArray33 {
    public static void main(String[] args) {
        int search = search(new int[]{4,5,6,7,0,1,2}, 2);
        System.out.println(search);
    }

    public static int search(int[] nums, int target) {
        int key = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                key = i;
                break;
            }
        }
        if (key == -1 || target == 1 || target == nums.length - 1) {
            return key;
        } else if (target > 0 && target < nums.length - 1) {
            if (key == target) key = nums.length;
            else if (key < target) {
                key = target - key;
            } else {
                key = nums.length - key;
            }
        }
        return key;
    }
}
