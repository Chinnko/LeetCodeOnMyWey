package page2;


import java.util.Arrays;

public class WordSearch79 {
    public static void main(String[] args) {
        char[][] chars = new char[3][4];
        chars[0] = new char[]{'A', 'B', 'C', 'E'};
        chars[1] = new char[]{'S', 'F', 'E', 'S'};
        chars[2] = new char[]{'A', 'D', 'E', 'E'};
//        char[][] chars = new char[1][2];
//        chars[0]=new char[]{'A','B'};
        System.out.println(exist(chars, "ABCESEEEFX"));
    }

    public static boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (board[x][y] == chars[0]) {
                    if (dp(board, new int[board.length][board[x].length], chars, x, y, 1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean dp(char[][] board, int[][] map, char[] chars, int x, int y, int pos) {
        map[x][y] = 1;
        if (pos == chars.length) {
            return true;
        }
        boolean result = false;
        if (x >= 1 && board[x - 1][y] == chars[pos] && map[x - 1][y] != 1) {
            result = result || dp(board, map, chars, x - 1, y, pos + 1);
        }
        if (x + 1 <= board.length - 1 && board[x + 1][y] == chars[pos] && map[x + 1][y] != 1) {
            result = result || dp(board, map, chars, x + 1, y, pos + 1);
        }
        if (y >= 1 && board[x][y - 1] == chars[pos] && map[x][y - 1] != 1) {
            result = result || dp(board, map, chars, x, y - 1, pos + 1);
        }
        if (y + 1 <= board[x].length - 1 && board[x][y + 1] == chars[pos] && map[x][y + 1] != 1) {
            result = result || dp(board, map, chars, x, y + 1, pos + 1);
        }
        map[x][y] = 0;
        return result;

    }
}
