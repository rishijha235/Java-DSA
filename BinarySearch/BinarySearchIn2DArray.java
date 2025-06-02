//row column sorted matrix
import java.util.Arrays;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {16, 29, 37, 49},
            {33, 34, 38, 50}
        };
        int target = 38;
        System.out.println(Arrays.toString(searchMatrix(matrix, target)));
    }
    
    public static int[] searchMatrix(int[][] matrix, int target) {
        //start searching from 0th row and last column
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[] {row, col};
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[] {-1, -1};
    }
}
