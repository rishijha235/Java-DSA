public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, n);
    }

    // N-Knights problem: Place N knights on an N x N chessboard such that no two knights threaten each other.
    // A knight can attack two squares horizontally and one square vertically, or two squares vertically and one square horizontally.
    static void knight(boolean[][] board, int row, int col, int knights) {
        if(knights == 0) {
            // All knights are placed successfully
            display(board);
            System.out.println();
            return;
        }

        //if col is out of bound
        if(row == board.length - 1 && col == board.length) {
            // If we have reached the end of the board and still have knights left to place
            return;
        }

        if(col == board.length) {
            // Move to the next row if we reach the end of the current row
            knight(board, row + 1, 0, knights);
            return;
        }

        if(isSafe(board, row, col)) {
            board[row][col] = true; // Place the knight at (row, col)
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false; // Backtrack: remove the knight from the current position
        }
        knight(board, row, col + 1, knights); // Try the next column without placing a knight
    }


    // Check if the knight can be placed at (row, col) without being attacked by another knight
    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Check if the knight can attack any other knight
        if (isValid(board, row - 2, col - 1)) {
            if(board[row - 2][col - 1]) {
                return false; // There is already a knight at this position
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if(board[row - 2][col + 1]) {
                return false; // There is already a knight at this position
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if(board[row - 1][col - 2]) {
                return false; // There is already a knight at this position
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if(board[row - 1][col + 2]) {
                return false; // There is already a knight at this position
            }
        }
        return true; // The position is safe to place a knight
    }


    // do not repeat yourself, hence created this function
    //to check if the things you have provided whether they are out of bound or not
    static boolean isValid(boolean[][] board, int row, int col) {
        // Check if the position is within the bounds of the board
        if(row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }


    private static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean element: row) {
                if(element) {
                    System.out.print("K");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
