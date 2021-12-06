package page3;

import com.sun.tools.javadoc.Start;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PalindromePartitioning131 {
    public static void main(String[] args) {
        System.out.println(partition("aab"));
    }

    static List<List<String>> array = new ArrayList<>();

    public static List<List<String>> partition(String s) {
        dp(s, 0, new LinkedList<>());
        return array;
    }

    private static void dp(String s, int start, LinkedList<String> list) {
        if (start == s.length()) {
            array.add(new LinkedList<>(list));
        }
        for (int i = start; i < s.length(); i++) {
            String substring = s.substring(start, i + 1);
            if (!canEnter(substring)) {
                continue;
            }
            list.addLast(substring);
            dp(s, i + 1, list);
            list.removeLast();
        }
    }

    private static boolean canEnter(String list) {
        if (list == null || list.length() <= 1) {
            return true;
        }
        char[] chars = list.toCharArray();
        if (chars.length == 2) {
            if (chars[0] != chars[1]) {
                return false;
            }
        }
        int start = 0, end = chars.length - 1;
        while (start != end) {
            if (chars[start] == chars[end]) {
                start++;
                if (start == end) {
                    return true;
                }
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

}
