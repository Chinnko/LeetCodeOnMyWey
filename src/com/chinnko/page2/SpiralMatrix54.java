package page2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix54 {
    public static void main(String[] args) {

    }

    public List<Integer> spiralOrder(int[][] matrix) {
        LinkedList<Integer> objects = new LinkedList<>();
        int x = 0, y = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int i1 = 0; i1 < matrix[i].length; i1++) {
                objects.add(matrix[i][i1]);
                if (i1 == matrix[i].length) {
                    i = i + 1;
                    i1 = matrix[i].length - 1;
                }
            }

        }

        return objects;
    }
}
