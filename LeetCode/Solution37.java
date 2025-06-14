public class Solution37 {
    public static void main(String[] args) {
        char [][] board = new char[][] {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        solveSudoku(board);
        System.out.println("Sudoku solved:");
        display(board);
    }

    static void solveSudoku(char[][] board) {
        solve(board);
    }

    static boolean solve(char[][] board) {
        // Check all row, if the board is completely filled
        for (int row = 0; row < 9; row++) {
            // Check all columns in the current row
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        // Check if the number can be placed in the current cell
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num;
                            if (solve(board)) {
                                return true; // Found a solution
                            }
                            board[row][col] = '.'; // Backtrack
                        }
                    }
                    return false; // No valid number found for this cell, backtrack
                }
            }
        }
        return true; // All cells are filled correctly
    }

    static boolean isSafe(char[][] board, int row, int col, char num) {
        // Check if the number is already present in the row, column
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num) return false;
        }
        // Check if the number is already present in the 3x3 sub-grid
        int startRow = row - row % 3, startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num) return false;
            }
        }
        return true;
    }

    static void display(char[][] board) {
        System.out.println("char[][] board = {");
        for (int i = 0; i < board.length; i++) {
            System.out.print("    {");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("'" + board[i][j] + "'");
                if (j < board[i].length - 1) System.out.print(", ");
            }
            System.out.print("}");
            if (i < board.length - 1) System.out.println(",");
            else System.out.println();
        }
        System.out.println("};");
    }
}
