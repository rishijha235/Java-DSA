import java.util.Arrays;

public class CeilingOfNum {
    public static void main(String[] args) {
        int[] arr = {-56, -12, 0, 1, 2, 3, 4, 5, 6, 7, 12, 56, 78, 88, 92, 95, 99, 102, 208};
        int target = -56;
        int[] ans = binarySearch(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    
    // for array in ascending order
    static int[] binarySearch(int[] arr, int target) {

        // if the target is greater than the last element of the array(for ceiling)
        if (target > arr[arr.length - 1]){
            return new int[] {-1};
        }

        // // if the target is less than the first element of the array(for floor)
        // if (target < arr[0]){
        //     return new int[] {-1};
        // }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                //it will return the index of the target if the target is present in the array
                return new int[] {mid};
            }
        }
        //it will return the ceiling number(not index) of the target that is smallest number that is >= target
        return new int[] {arr[start]};
        // //it will return the floor number(not index) of the target that is biggest number that is <= target
        // return new int[] {arr[end]};
    }
}