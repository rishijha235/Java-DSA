class Solution493{
    public static void main(String[] args) {
        int[] nums = {1,3,2,3,1};
        System.out.println(reversePairs(nums));
    }
    public static int reversePairs(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] > 0 && 2 * nums[j] < 0){
                    break;
                }
                else if(nums[i] > 2 * nums[j]){
                    count++;
                }
            }
            long sum = (-2147483647 * 2);
            System.out.println(sum);
        }
        return count;
    }
}