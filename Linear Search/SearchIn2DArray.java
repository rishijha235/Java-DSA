import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int arr[][] = {
            {10, 18, 8},
            {45, 15, -6},
            {81, 19},
            {28, -91, 52, 101}
        };
        int target = -91;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        //if target is not found
        return new int[]{-1, -1};
    }    
}



