public class SudokuSolver {
    public static void main(String[] args) {
        int [][] board = new int[][] {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if(solveSudoku(board)) {
            System.out.println("Sudoku solved successfully:");
            display(board);
        } else {
            System.out.println("No solution exists for the given Sudoku.");
        }
    }

    static boolean solveSudoku(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        // this is how we are replacing the r,c from arguments
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            //if you found some empty element in row, then break
            if(emptyLeft == false) {
                break;
            }
        }

        // No empty space left, means sudoku is solved
        if(emptyLeft == true) {
            return true;
        }

        // Try numbers from 1 to 9 in the empty cell
        for(int number = 1; number <= 9; number++) {
            if(isSafe(board, row, col, number)) {
                board[row][col] = number; // place the number
                if(solveSudoku(board)) {
                    return true; //found the ans;
                } else {
                    board[row][col] = 0; //backtrack
                }
            }
        }
        return false; //no solution found
    }


    static boolean isSafe(int[][] board, int row, int col, int num) {
        // Checking row
        for(int i = 0; i < board.length; i++) {
            //check if the num is in the row
            if(board[row][i] == num) {
                return false;
            }
        }

        // Checking column
        for(int[] nums : board) {
            //check if the num is in the column
            if(nums[col] == num) {
                return false;
            }
        }

        // Checking 3x3 subgrid
        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for(int r = rowStart; r < rowStart + sqrt; r++) {
            for(int c = colStart; c < colStart + sqrt; c++) {
                //check if the num is in the 3x3 subgrid
                if(board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void display(int[][] board) {
        for(int[] row : board) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
