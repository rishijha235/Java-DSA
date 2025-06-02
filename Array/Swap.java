import java.util.Arrays;
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        
    int[] arr = {1, 2, 3, 4, 5};
    // swap(arr, 1, 3);
    reverse(arr);

    System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index3) {
        int temp = arr[index1];
        arr[index1] = arr[index3];
        arr[index3] = temp;

        // //output using for loop
        // for(int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }

}
