package 动态规划;

import java.util.ArrayList;
import java.util.HashMap;

public class ClimbingStairs70 {
    public static void main(String[] args) {
        System.out.println(new ClimbingStairs70().climbStairs(4));
    }

    public HashMap<Integer, Integer> copy = new HashMap<>();

    {
        copy.put(0, 0);
        copy.put(1, 1);
        copy.put(2, 2);
        copy.put(3, 3);
    }

    public int climbStairs(int n) {
        Integer integer = copy.get(n);
        if (integer == null) {
            copy.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        }
        return copy.get(n);
    }
}
