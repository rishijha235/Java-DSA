public class PeakIndex852 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,9,0};
        System.out.println(peakIndexInMountainArray(arr));
        
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in descending part of the array
                // this may be the ans, but look at left
                end = mid;
            } else {
                // you are in ascending part of the array
                // this can't be the ans as [mid+1] > [mid] and we have to find the peak element(that is largest)
                start = mid + 1;
            }
        }
        //in the end start == end. so, we can return either start or end as both are equal
        return start;
    }
    
}
