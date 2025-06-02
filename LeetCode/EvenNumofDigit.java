public class EvenNumofDigit {
    public static void main(String[] args) {
        int[] nums = {437,315,322,431,686,264,442};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        int evenNum = 0;
        for(int i = 0; i < nums.length; i++) {
            int ValAtIndex = nums[i];
            while(ValAtIndex != 0){
                int rem = ValAtIndex % 10;
                count += 1;
                ValAtIndex /= 10;
            }
            if (count % 2 == 0){
                evenNum += 1;
            }
            count = 0; // Reset count for the next number
        }   
        return evenNum;
    }
}
