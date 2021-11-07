package 动态规划;

public class IsSubsequence392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        char[] som = s.toCharArray();
        char[] chars = t.toCharArray();
        int x = 0, y = 0;
        while (chars.length != x && y != som.length) {
            if (chars[x] == som[y]) {
                y++;
            }
            x++;
        }
        return y == som.length;
    }
}
