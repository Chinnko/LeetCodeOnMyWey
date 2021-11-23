package page2;

import java.time.chrono.MinguoDate;

public class SearchA2DMatrix74 {
    public static void main(String[] args) {
        SearchA2DMatrix74 searchA2DMatrix74 = new SearchA2DMatrix74();
        int[][] ints = new int[3][4];
        ints[0] = new int[]{-8, -7, -5, -3, -3, -1, 1};
        ints[1] = new int[]{10, 11, 16, 20};
        ints[2] = new int[]{23, 30, 34, 50};
        boolean b = searchA2DMatrix74.searchMatrix(ints, -5);
        System.out.println(b);
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int[] matrix1 = matrix[i];
            int start = 0, end = matrix1.length - 1;
            while (matrix1[start] <= target && matrix1[end] >= target) {
                int mid = (start + end) / 2;
                if (matrix1[start] == target || matrix1[end] == target) {
                    return true;
                }
                if (matrix1[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
        }
        return false;
    }
}
