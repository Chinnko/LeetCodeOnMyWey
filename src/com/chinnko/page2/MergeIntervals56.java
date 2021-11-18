package page2;

import java.util.ArrayList;

public class MergeIntervals56 {
    public static void main(String[] args) {
        int[][] a = new int[4][2];
        a[0] = new int[]{1, 3};
        a[1] = new int[]{2, 6};
        a[2] = new int[]{8, 10};
        a[3] = new int[]{15, 18};
        System.out.println(new MergeIntervals56().merge(a));

    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        ArrayList<int[]> objects = new ArrayList<>();
        int[] ints = intervals[0];
        objects.add(ints);
        int end = ints[1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = intervals[i][1];
                ints[1] = end;
            } else {
                ints = intervals[i];
                objects.add(ints);
            }

        }
        int[][] ints1 = new int[objects.size()][2];
        for (int i = 0; i < ints1.length; i++) {
            ints1[i] = objects.get(i);
        }
        return ints1;
    }

}
