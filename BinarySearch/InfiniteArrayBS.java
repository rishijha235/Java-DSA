import java.util.Arrays;

public class InfiniteArrayBS {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Finding the range in which the target element exists
            while (arr[end] < target) {
                start = end + 1;  
                end = end * 2;
        }
        
        // Perform binary search within the found range
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}







// // by Kunal Kushwaha
// public class InfiniteArrayBS {
//     public static void main(String[] args) {
//         int[] arr = {-56, -12, 0, 1, 2, 3, 4, 5, 6, 7, 12, 56, 78, 88, 92, 95, 99, 102, 208};
//         int target = 88;
//         int ans = FindRange(arr, target);
//         System.out.println(ans);
//     }

//     // Finding the range in which the target element exists
//     static int FindRange(int[] arr, int target){
//         int start = 0;
//         int end = 1;

//         // start with 2 length array then doubling the length of array till arr[end] >= target
//         while (arr[end] < target) {
//             int newStart = end + 1;
//             // incrementing the end pointer to double the range   
//             end = end + (end - start + 1) * 2;
//             start = newStart;
//         }
//         return binarySearch(arr, target, start, end);
//     }

//     static int binarySearch(int[] arr, int target, int start, int end) {

//         // Perform binary search within the found range
//         while (start <= end) {
//             int mid = start + ((end - start) / 2);
//             if (arr[mid] > target) {
//                 end = mid - 1;
//             } else if (arr[mid] < target) {
//                 start = mid + 1;
//             } else {
//                 return mid;
//             }
//         }

//         return -1;
//     }
// }