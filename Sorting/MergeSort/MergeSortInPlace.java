import java.util.Arrays;

//for sorting an array in place(Without using extra space)
public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 8, 7};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSortInPlace(int[] arr, int start, int end) {
        if (end - start == 1){
            return;
        }
        int mid = (start + end) / 2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);
        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end){
        int[] result = new int[end - start];
        
        int i = start;
        int j = mid;
        int k = 0;
        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                result[k] = arr[i];
                i++;
            } else {
                result[k] = arr[j];
                j++;
            }
            k++;
        }

        //it may be possible that one of the arrays is not completely traversed
        //copy the remaining elements
        while(i < mid){
            result[k] = arr[i];
            i++;
            k++;
        }
        while(j < end){
            result[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < result.length; l++) {
            arr[start + l] = result[l];
        }
    }
}
