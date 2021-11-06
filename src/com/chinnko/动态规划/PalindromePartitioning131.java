package 动态规划;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning131 {

    public List<List<String>> partition(String s) {
        List<List<String>> objects = new ArrayList<>();
        return objects;
    }


    public static boolean enter(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
