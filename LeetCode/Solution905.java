import java.util.Arrays;
public class Solution905 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 4};
        int[] result = sortArrayByParity(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            if(nums[start] % 2 == 0){
                start++;
            } else {
                if(nums[end] % 2 != 0){
                    end--;
                } else {
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    start++;
                    end--;
                }
            }
        }
        return nums;
    }
}
