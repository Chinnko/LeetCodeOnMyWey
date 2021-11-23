package page2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combinations77 {

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }

    public static List<List<Integer>> arrays = new ArrayList<>();


    public static List<List<Integer>> combine(int n, int k) {
        dp(new LinkedList<>(), n, k, 1);
        return arrays;

    }

    public static void dp(LinkedList<Integer> integers, int n, int k, int pos) {
        if (integers.size() > k) {
            return;
        }
        if (integers.size() == k) {
            arrays.add(new LinkedList<>(integers));
        }
        for (int i = pos; i <= n; i++) {
            integers.add(i);
            dp(integers, n, k, i + 1);
            integers.removeLast();
        }

    }
}
