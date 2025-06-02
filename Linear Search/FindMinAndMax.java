import java.util.Scanner;

public class FindMinAndMax {
    public static void main(String[] args) {
        int[] arr = {12, 18, 25, 16, 8};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    //function to find the min value in the array
    static int min(int[] arr) {
        //In case if array is empty
        if (arr.length == 0) {
            return -1;
        }

        //If array is not empty
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //function to find the max value in the array
    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
}
