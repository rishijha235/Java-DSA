//Amazon and Google Question

import java.util.Arrays;

// public class RotatedSortedArray33 {
//     public static void main(String[] args) {
//         int[] nums = {5,1,3}; 
//         int target = 3;
//         System.out.println(search(nums, target));
       
        
//     }

//     public static int search(int[] nums, int target) {
//         int start = 0;
//         int end = nums.length - 1;
//         while(start <= end) {
//             int mid = start + (end - start) / 2;
//             if(nums[mid] == target) {
//                 return mid;
//             }
//             if(nums[start] < nums[mid]) {
//                 if(target >= nums[start] && target < nums[mid]) {
//                     end = mid - 1;
//                 } else {
//                     start = mid + 1;
//                 }
//             } else {
//                 if(target > nums[mid] && target <= nums[end]) {
//                     start = mid + 1;
//                 } else {
//                     end = mid - 1;
//                 }
//             }
//         }
//         return -1;
//     }
    
// }




//by Kunal Kushwaha
public class RotatedSortedArray33 {
    public static void main(String[] args) {
        int[] nums = {2,9,2,2,2,2,2}; 
        int target = 2;
        System.out.println(search(nums, target));
        System.out.println(findPivot(nums));
    
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if(nums[pivot] == target) {
            return pivot;
        }
        if(target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
 
        while(start <= end){
         int mid = start + ((end - start) / 2);
            if(nums[mid] > target){
                end = mid - 1;
            } else if(nums[mid] < target){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases over here
            if(mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

