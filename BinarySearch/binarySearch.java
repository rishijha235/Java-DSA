

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-56, -12, 0, 1, 2, 3, 4, 5, 6, 7, 12, 56, 78, 88, 92, 95, 99, 102, 208};
        int target = -56;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
        
    }
    //for array in ascending order
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
         int mid = start + ((end - start) / 2);
            if(arr[mid] > target){
                end = mid - 1;
            } else if(arr[mid] < target){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    
}
