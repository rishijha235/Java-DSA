import java.util.ArrayList;
import java.util.List;

public class Solution441 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(arr));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
        for(int k = nums.length - 1; k >= 0; k--){
            if(nums[k] != k + 1){
                result.add(nums[k]);
            }
        }
    return result;
    }
}
