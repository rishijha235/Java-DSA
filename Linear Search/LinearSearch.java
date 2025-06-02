import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {10, 16, 25, 13, 75, 725, -91};
        int target = 25;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

        //output results within the range of start and end index
        int ans2 = linearSearch(nums, target, 2, 5);
        System.out.println(ans2);
        
    }

    //Search target element in the array: return the index if element found
    //otherwise return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++){
            if(arr[index] == target){
                return index;
            }

        }
        return -1;
    }


    //Search the target element in the range specified by the start and end index
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++){
            if(arr[index] == target){
                return index;
            }

        }
        return -1;
    }

}
        
    
    

