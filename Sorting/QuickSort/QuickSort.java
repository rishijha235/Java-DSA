package Java.Sorting.QuickSort;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 8, 7};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];
        while(start <= end){
            //if its already sorted then no need to swap
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end --;
            }
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        //now the pivot is at its correct position, so sort the left and right subarrays
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
}
