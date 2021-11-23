package page2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals56 {
    public static void main(String[] args) {
        int[][] a = new int[4][2];
        a[0] = new int[]{1, 4};
        a[1] = new int[]{0, 4};
        a[2] = new int[]{8, 10};
        a[3] = new int[]{15, 18};
        int[][] merge = new MergeIntervals56().merge(a);

        System.out.println(merge);

    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        ArrayList<int[]> objects = new ArrayList<>();
        int[] ints = intervals[0];
        objects.add(ints);
        for (int i = 1; i < intervals.length; i++) {
            int[] currentArray = intervals[i];
            if (ints[1] >= currentArray[0]) {
                ints[1] = Math.max(currentArray[1], ints[1]);
                ints[0] = Math.min(currentArray[0], ints[0]);
                continue;
            }
            if (ints[0] >= currentArray[0]) {
                ints[0] = Math.min(currentArray[0], ints[0]);
                ints[1] = Math.max(currentArray[1], ints[1]);
                continue;
            }
            objects.add(currentArray);
            ints = currentArray;
        }
        int[][] ints1 = new int[objects.size()][2];
        for (int i = 0; i < ints1.length; i++) {
            ints1[i] = objects.get(i);
        }
        return ints1;
    }

}
