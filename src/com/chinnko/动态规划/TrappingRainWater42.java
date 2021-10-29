package 动态规划;

public class TrappingRainWater42 {
    public static void main(String[] args) {
        System.out.println(new TrappingRainWater42().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    public int trap(int[] height) {
        int peak_index = 0;
        for(int i = 0 ;i<height.length;i++){
            if(height[i]>height[peak_index]){
                peak_index=i;
            }
        }
        int leftMostBar = 0;
        int water  = 0;
        for(int i = 0;i<peak_index;i++){
            if(height[i]>leftMostBar){
                leftMostBar=height[i];
            }else{
                water += leftMostBar - height[i];
            }
        }
        int rightMostBar  = 0;
        for(int i = height.length-1;i>peak_index;i--){
            if(height[i]>rightMostBar){
                rightMostBar = height[i];
            }else{
                water += rightMostBar - height[i];
            }
        }
        return water;

    }

//    public int trap(int[] height) {
//        if (height.length <= 1) {
//            return 0;
//        }
//        int max = Integer.MIN_VALUE;
//        for (int i : height) {
//            max = Math.max(max, i);
//        }
//        int count = 0, left = 0;
//        for (int i = 1; i < height.length; i++) {
//            int num = height[i];
//            if (num == 0) {
//                continue;
//            }
//            if (height[left] == 0) {
//                left = i;
//                continue;
//            }
//
//            if (num - height[left] >= 0) {
//                int min = Math.min(num, height[left]);
//                for (int j = left; j < i; j++) {
//                    count = count + min - height[j];
//                }
//                left = i;
//            }
//            if (height[left] == max && height.length > left + 1 && left != 0) {
//                left = left + 1;
//            }
//        }
//        return count;
//    }


}

