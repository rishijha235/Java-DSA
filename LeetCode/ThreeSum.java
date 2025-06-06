import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        // List<List<Integer>> result = threeSum(nums);
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            //we have sorted the array so if nums[i] > 0, that means all elements after i are greater than nums[i] and we can't get sum equal to nums[i]
             if (nums[i] > 0) {
                break;
            }
            //if nums[i] & nums[i + 1] both are same then check for only one because both will give same ans, and we don't need duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1; 
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
            }
        }
        return res;
    }
}
