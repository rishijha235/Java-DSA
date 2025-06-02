import java.util.Arrays;

//for sorting an array using extra space
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 8, 7};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second){
        int[] result = new int[first.length + second.length];
        
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                result[k] = first[i];
                i++;
            } else {
                result[k] = second[j];
                j++;
            }
            k++;
        }

        //it may be possible that one of the arrays is not completely traversed
        //copy the remaining elements
        while(i < first.length){
            result[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            result[k] = second[j];
            j++;
            k++;
        }
        return result;
    }
}
