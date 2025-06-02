import java.util.Arrays;

// public class SelectionSort {
//     public static void main(String[] args) {
//         int[] arr = {12, 24, 72, 0, -12, 72, 36, 86, 1};
//         System.out.println(Arrays.toString(selectionSort(arr)));
//     }
    
//     public static int[] selectionSort(int[] arr) {
//         for(int i = 0; i < arr.length; i++) {
//             int minIndex = i;
//             for(int j = i; j < arr.length; j++) {
//                 if(arr[j] < arr[minIndex]) {
//                     minIndex = j;
//                 }
//             }
//             int temp = arr[i];
//             arr[i] = arr[minIndex];
//             arr[minIndex] = temp;
//         }
//         return arr;
//     }
// }


// by Kunal Kushwaha
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12, 24, 72, 0, -12, 72, 36, 86, 1};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void Selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
        // find the max item in the remaining array and swap with correct index
        int last = arr.length - i -  1;
        int maxIndex = getMaxIndex(arr, 0, last);
        swap(arr, maxIndex, last);
        }
    }
    
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
