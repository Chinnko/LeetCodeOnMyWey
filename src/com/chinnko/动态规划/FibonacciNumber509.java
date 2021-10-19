package 动态规划;

import java.util.HashMap;

public class FibonacciNumber509 {
    public static void main(String[] args) {
        System.out.println(new FibonacciNumber509().fib(4));
    }

    public HashMap<Integer, Integer> copy = new HashMap<>();

    public int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (copy.get(n) == null) {
            copy.put(n - 1, fib(n - 1));
            copy.put(n - 2, fib(n - 2));
        }
        return copy.get(n - 1) + copy.get(n - 2);
    }
}
