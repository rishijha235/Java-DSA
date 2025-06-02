import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {67, 29, 45, 10, 19, 6};
        int[] sortedArr = bubbleSort(arr);
        sortedArr = bubbleSort(arr);
        System.out.println(Arrays.toString(sortedArr));
        
    }

    public static int[] bubbleSort(int[] arr){
        boolean swapped;
        // run the steps n-1 times
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            //for each step max item will come at the last respective index
            for (int j = 1; j< arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                    // swap if the item is smaller than previous item
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if(!swapped) { //!false = true
                break;
            }
        }
        return arr;
    }  
}
