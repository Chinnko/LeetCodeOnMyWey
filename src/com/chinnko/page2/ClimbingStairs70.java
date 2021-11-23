package page2;

import java.util.HashMap;
import java.util.HashSet;

public class ClimbingStairs70 {
    public static void main(String[] args) {

    }

    HashMap<Integer, Integer> ints = new HashMap();

    {
        ints.put(0, 0);
        ints.put(1, 1);
        ints.put(2, 2);

    }

    public int climbStairs(int n) {
        Integer integer = ints.get(n);
        if (integer == null) {
            ints.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        }
        return ints.get(n);
    }
}
