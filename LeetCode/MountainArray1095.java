public class MountainArray1095 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,0};
        int target = 2;
        System.out.println(new MountainArray1095().search(arr, target));
        
    }

    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTy = binarySearch(arr, target, 0, peak);
        if (firstTy != -1) {
            return firstTy;
        }
        return binarySearch(arr, target, peak + 1, arr.length - 1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

         int mid = start + ((end - start) / 2);

         if(arr[mid] == target){
             return mid;
         }
         //if the array is sorted in ascending order
         if(isAsc){
             if(arr[mid] > target){
                 end = mid - 1;
             } else {
                 start = mid + 1;
             }
         } 
         //else, the array is sorted in descending order
         else {
             if(arr[mid] < target){
                 end = mid - 1;
             } else {
                 start = mid + 1;
             }
         }
        }
        return -1;
    }
}