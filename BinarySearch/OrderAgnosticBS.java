import java.util.Arrays;

// public class OrderAgnosticBS {
//     public static void main(String[] args) {
//         int[] arr = {208, 201, 128, 115, 105, 99, 86, 75, 50, 42, 38, 27, 12, 7, 5, 2, -6, -12, -27};
//         int target = 42;
//         int ans = binarySearch(arr, target);
//         System.out.println(ans);
        
//     }
//     //if we don't know either the array in ascending order or descending order
//     static int binarySearch(int[] arr, int target){
//         int start = 0;
//         int end = arr.length - 1;

//         while(start <= end){
//          int mid = start + ((end - start) / 2);
//          //for ascending order
//          if (arr[start] < arr[end]) {
//             if(arr[mid] > target){
//                 end = mid - 1;
//             } else if(arr[mid] < target){
//                 start = mid + 1;
//             } else {
//                 return mid;
//             }
//         }
//         //for descending order
//         else{
//             if(arr[mid] > target){
//                 start = mid + 1;
//             } else if(arr[mid] < target){
//                 end = mid - 1;
//             } else {
//                 return mid;
//             }
//         }
//         }
//         return -1;
//     }   
// }




//Method 2 by Kunal Kushwaha
public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {208, 201, 128, 115, 105, 99, 86, 75, 50, 42, 38, 27, 12, 7, 5, 2, -6, -12, -27};
        int target = 208;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

         int mid = start + ((end - start) / 2);

         if(arr[mid] == target){
             return mid;
         }
         //if the array is sorted in ascending order
         if(isAsc){
             if(arr[mid] > target){
                 end = mid - 1;
             } else {
                 start = mid + 1;
             }
         } 
         //else, the array is sorted in descending order
         else {
             if(arr[mid] < target){
                 end = mid - 1;
             } else {
                 start = mid + 1;
             }
         }
        }
        return -1;
    }

}