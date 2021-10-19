package 动态规划;

import java.util.HashMap;

public class NthTribonacciNumber1173 {

    public static void main(String[] args) {
        System.out.println(new NthTribonacciNumber1173().tribonacci(4));
    }

    public HashMap<Integer, Integer> copy = new HashMap<>();

    {
        copy.put(0, 0);
        copy.put(1, 1);
        copy.put(2, 1);
    }

    public int tribonacci(int n) {
        Integer integer = copy.get(n);
        if (integer == null) {
            copy.put(n, tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3));
        }
        return copy.get(n);
    }

}
