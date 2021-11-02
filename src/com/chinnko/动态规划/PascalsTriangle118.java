package 动态规划;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arrayLists = new ArrayList<>();
        ArrayList<Integer> objects = new ArrayList<>();
        objects.add(1);
        arrayLists.add(objects);
        if (numRows == 1) {
            return arrayLists;
        }
        for (int i = 1; i < numRows; i++) {
            objects = new ArrayList<>();
            for (int i1 = 0; i1 < i + 1; i1++) {
                if (i1 == 0 || i1 == i) {
                    objects.add(1);
                } else {
                    objects.add(arrayLists.get(i - 1).get(i1) + arrayLists.get(i - 1).get(i1 - 1));
                }
            }
            arrayLists.add(objects);
        }
        return arrayLists;
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> arrayLists = new ArrayList<>();
        ArrayList<Integer> objects = new ArrayList<>();
        objects.add(1);
        arrayLists.add(objects);
        if (rowIndex == 1) {
            return objects;
        }
        for (int i = 1; i < rowIndex+1; i++) {
            objects = new ArrayList<>();
            for (int i1 = 0; i1 < i + 1; i1++) {
                if (i1 == 0 || i1 == i) {
                    objects.add(1);
                } else {
                    objects.add(arrayLists.get(i - 1).get(i1) + arrayLists.get(i - 1).get(i1 - 1));
                }
            }
            arrayLists.add(objects);
        }
        return arrayLists.get(rowIndex);

    }
}