import java.util.Arrays;

// public class Solution34 {
//     public static void main(String[] args) {
//         int[] nums = {};
//         int target = 3;
//         int[] ans = searchRange(nums, target);
//         System.out.println(Arrays.toString(ans));
        
//     }

//     public static int[] searchRange(int[] nums, int target) {
//         int start = 0;
//         int end = nums.length - 1;

//         while (start <= end) {
//             // if (nums.length == 0){
//             //     return new int[] {-1, -1};
//             // }
//             int mid = start + ((end - start) / 2);
//             if (nums[mid] > target){
//                 end = mid -1;
//             } else if (nums[mid] < target) {
//                 start = mid + 1;
//             } 
//             // for (nums[mid] == target)
//             else {
//                 int left = mid;
//                 int right = mid;
//                 while (left > 0 && nums[left - 1] == target) {
//                     left--;
//                 }
//                 while (right < nums.length - 1 && nums[right + 1] == target) {
//                     right++;
//                 }
//                 return new int[] {left, right};
//             }
//         }
//         return new int[] {-1, -1};
//     }
// }




//M2 by Kunal Kushwaha
public class Solution34 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3};
        int target = 2;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
        
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
        ans[1] = search(nums, target, false);
        }
        return ans;
    }

    public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] > target){
                end = mid -1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {

                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
    

