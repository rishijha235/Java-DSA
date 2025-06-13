public class Solution52 {
    public static void main(String[] args) {
        System.out.println(totalNQueens(5));;
    }

    public static int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return queens(board, 0);
    }

    static int queens(boolean[][] board, int row) {
        if(row == board.length) {
            // All queens are placed successfully(we found one of our answers)
            return 1;
        }

        int count = 0; // To count the number of ways to place queens

        // placing the queen and checking for every row and col
        for(int col = 0; col < board.length; col++) {
            //place the queen if it is safe
            if(isSafe(board, row, col)) {
                board[row][col] = true; // Place the queen at (row, col)
                count += queens(board, row + 1); // Recursively place the next queen
                board[row][col] = false; // Backtrack: remove the queen from the current position
            }
        }
        return count;
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
}
