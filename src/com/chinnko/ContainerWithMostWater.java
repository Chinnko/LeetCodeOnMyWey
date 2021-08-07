public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] ints = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(ints));
    }

    public static int maxArea(int[] height) {
        int right = height.length-1;
        int left = 0;
        int ans = 0;
        while (right != left) {
            int dis = right - left;
            ans = Math.max(ans, dis * Math.min(height[right], height[left]));
            if (height[right] > height[left]) {
                left = left + 1;
            } else {
                right = right - 1;
            }
        }
        return ans;
    }
}
