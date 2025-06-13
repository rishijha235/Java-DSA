import java.util.List;
import java.util.ArrayList;

public class Solution51 {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        queens(board, 0, solutions);
        return solutions;
    }

    private static void queens(boolean[][] board, int row, List<List<String>> solutions) {
        if(row == board.length) {
            // All queens are placed successfully
            solutions.add(display(board));
            return;
        }

        // placing the queen and checking for every row and col
        for(int col = 0; col < board.length; col++) {
            //place the queen if it is safe
            if(isSafe(board, row, col)) {
                board[row][col] = true; // Place the queen at (row, col)
                queens(board, row + 1, solutions); // Recursively place the next queen
                board[row][col] = false; // Backtrack: remove the queen from the current position
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertaical row
        for(int i = 0; i < row; i++) {
            if(board[i][col]) {
                return false; // There is a queen in the same column
            }
        }

        //check left diagonal
        int maxLeft = Math.min(row, col);
        for(int i = 1; i <= maxLeft; i++) {
            if(board[row - i][col - i]) {
                return false; // There is a queen in the left diagonal
            }
        }

        //check right diagonal
        int maxRight = Math.min(row, board.length - 1 - col);
        for(int i = 1; i <= maxRight; i++) {
            if(board[row - i][col + i]) {
                return false; // There is a queen in the right diagonal
            }
        }
        return true; // The position is safe to place a queen
    }

    private static List<String> display(boolean[][] board) {
        List<String> res = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (boolean cell : row) {
                sb.append(cell ? 'Q' : '.');
            }
            res.add(sb.toString());
        }
        return res;
    }
}
