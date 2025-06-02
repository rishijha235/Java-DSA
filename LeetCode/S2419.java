public class S2419 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,2,4};
        int maxLength = longestSubarray(nums);
        System.out.println(maxLength);
    }

    public static int longestSubarray(int[] nums) {
        int max = nums[0];
        // for max element in the array
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        int count = 0;
        int result = 0;
        // for continous max elements in the array
        for(int j = 0; j < nums.length; j++){
            if(nums[j] == max){
                count++;
                result = Math.max(result, count);
            }
            else{
                count = 0;
            }   
        }
        return result;
    }
}
