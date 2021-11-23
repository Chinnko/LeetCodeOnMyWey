package page2;

import java.util.ArrayList;

public class InsertInterval57 {
    public static void main(String[] args) {
        InsertInterval57 insertInterval57 = new InsertInterval57();
        int[][] ints = new int[5][2];
        ints[0] = new int[]{1, 2};
        ints[1] = new int[]{3, 5};
        ints[2] = new int[]{6, 7};
        ints[3] = new int[]{8, 10};
        ints[4] = new int[]{12, 16};
        insertInterval57.insert(ints, new int[]{4, 8});


    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> objects = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[1] >= newInterval[0]) {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }

        }
        return intervals;
    }
}
