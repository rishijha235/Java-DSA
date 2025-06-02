public class CountNumOfNiceSubarray1248 {
    public static void main(String[] args) {
        int[] nums = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        System.out.println(numberOfSubarrays(nums, k));
        }

        public static int numberOfSubarrays(int[] nums, int k) {
        // Time Limit Exceed (time complexity O(N^2)  
        // int start = 0;
        // int count = 0;
        // while (start < nums.length){
        //     int sum = 0;
        //     for(int i = start; i < nums.length; i++){
        //         if(nums[i] % 2 == 0){
        //             nums[i] = 0;
        //             }
        //         else{
        //             nums[i] = 1;
        //         }
        //         sum += nums[i];
        //         if(sum == k){
        //             count++;
        //         }
        //         if (sum > k || i == nums.length - 1){
        //             break;
        //         }
        //     }
        //     start++;
        // }
        // return count;


        //time complexity O(N)
        int count = 0;
        int oddCount = 0;
        int[] prefixSum = new int[nums.length + 1];
        prefixSum[0] = 1;

        for (int i = 0; i < nums.length; i++) {
            oddCount += nums[i] % 2;
            if (oddCount >= k) {
            count += prefixSum[oddCount - k];
            }
            prefixSum[oddCount]++;
        }

        return count;
    }
}
