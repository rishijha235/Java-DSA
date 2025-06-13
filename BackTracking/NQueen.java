public class NQueen {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));;
    }

    // N-Queens problem: Place N queens on an N x N chessboard such that no two queens threaten each other.
    // A queen can attack another queen if they are in the same row, column, or diagonal.
    // This function will return the number of ways to place N queens on the board.
    // we are not taking col here because we are starting col from 0 everytime, it's not make sence to pass it
    static int queens(boolean[][] board, int row) {
        if(row == board.length) {
            // All queens are placed successfully
            display(board);
            System.out.println();
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



    private static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean element: row) {
                if(element) {
                    System.out.print("Q");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
