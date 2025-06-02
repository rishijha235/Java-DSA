public class InfiniteArrayBS {
    public static void main(String[] args) {
        int[] arr = {-56, -12, 0, 1, 2, 3, 4, 5, 6, 7, 12, 56, 78, 88, 92, 95, 99, 102, 208};
        int target = 102;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Finding the range in which the target element exists
           
            while (arr[end] < target) {
                start = end + 1;  
                end = end * 2;
            }
        // Perform binary search within the found range
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}