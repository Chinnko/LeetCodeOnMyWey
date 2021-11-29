package page1;

import java.util.HashSet;

public class ValidSudoku36 {
    public static void main(String[] args) {

        ValidSudoku36 validSudoku36 = new ValidSudoku36();
        boolean validSudoku = validSudoku36.isValidSudoku(new char[][]{{'5', '.', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'.', '.', '.', '.', '5', '.', '5', '.', '.'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}});
        System.out.println(validSudoku);

    }
//        [["7",".",".",".","4",".",".",".","."],
//        [".",".",".","8","6","5",".",".","."],
//        [".","1",".","2",".",".",".",".","."],
//        [".",".",".",".",".","9",".",".","."],
//        [".",".",".",".","5",".","5",".","."],
//        [".",".",".",".",".",".",".",".","."],
//        [".",".",".",".",".",".","2",".","."],
//        [".",".",".",".",".",".",".",".","."],
//        [".",".",".",".",".",".",".",".","."]]

    public boolean isValidSudoku(char[][] board) {
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (x % 3 == 0 && y % 3 == 0) {
                    System.out.println("nineCheck:" + nineCheck(board, x, y) + "x:" + x + "y:" + y);
                    System.out.println("rowCheck:" + rowCheck(board, x, y) + "x:" + x + "y:" + y);
                    System.out.println("lineCheck:" + lineCheck(board, x, y) + "x:" + x + "y:" + y);
                    if(!(nineCheck(board, x, y) && rowCheck(board, x, y) && lineCheck(board, x, y))) {
                        return false;
                    }
                } else {
                    System.out.println("rowCheck:" + rowCheck(board, x, y) + "x:" + x + "y:" + y);
                    System.out.println("lineCheck:" + lineCheck(board, x, y) + "x:" + x + "y:" + y);
                    if (!(lineCheck(board, x, y) && rowCheck(board, x, y))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean nineCheck(char[][] board, int x, int y) {
        HashSet<Character> chars = new HashSet<>();
        for (int i = x; i < x + 3; i++) {
            for (int i1 = y; i1 < y + 3; i1++) {
                if (board[i][i1] != '.' && !chars.add(board[i][i1])) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean rowCheck(char[][] board, int x, int y) {
        HashSet<Character> chars = new HashSet<>();
        for (int i = 0; i < board[x].length; i++) {
            if (board[i][y] != '.' && !chars.add(board[i][y])) {
                return false;
            }
        }
        return true;
    }

    public boolean lineCheck(char[][] board, int x, int y) {
        HashSet<Character> chars = new HashSet<>();
        char[] chars1 = board[x];
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != '.' && !chars.add(chars1[i])) {
                return false;
            }
        }
        return true;
    }
}
