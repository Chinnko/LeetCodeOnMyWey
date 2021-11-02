package 动态规划;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Triangle120 {
    //    [[2],[3,4],[6,5,7],[4,1,8,3]]
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> objects = new ArrayList<>();

        ArrayList<Integer> objects1 = new ArrayList<>();
        objects1.add(2);
        objects.add(objects1);
        objects1 = new ArrayList<>();
        objects1.add(3);
        objects1.add(4);
        objects.add(objects1);
        objects1 = new ArrayList<>();
        objects1.add(6);
        objects1.add(5);
        objects1.add(7);
        objects.add(objects1);
        objects1 = new ArrayList<>();
        objects1.add(4);
        objects1.add(1);
        objects1.add(8);
        objects1.add(3);
        objects.add(objects1);
        new Triangle120().minimumTotal(objects);
    }

    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        if (triangle.size() == 1) {
            return triangle.get(0).get(0);
        }
        int[][] out = new int[triangle.size()][triangle.get(triangle.size() - 1).size()];
        out[0][0] = triangle.get(0).get(0);
        int outSize = Integer.MAX_VALUE;
        for (int i = 1; i < triangle.size(); i++) {
            for (int i1 = 0; i1 < triangle.get(i).size(); i1++) {
                if (i1 == 0) {
                    out[i][i1] = out[i - 1][i1];
                } else if (i1 == i) {
                    out[i][i1] = out[i - 1][i1 - 1];
                } else {
                    out[i][i1] = Math.min(out[i - 1][i1], out[i - 1][i1 - 1]);
                }
                out[i][i1] = out[i][i1] + triangle.get(i).get(i1);
                if (out.length - 1 == i) {
                    outSize = Math.min(outSize,  out[i][i1]);
                }
            }
        }
        return outSize;
    }
}
