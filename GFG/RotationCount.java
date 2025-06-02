import java.util.Arrays;

public class RotationCount {

    public static void main(String[] args) {
        int[] arr = {2,3,6,12}; 
        int n = 6;
        System.out.println(findKRotation(arr, n));
    }
    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            //4 cases over here
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int findKRotation(int arr[], int n) {
        // code here
        int pivot = findPivot(arr);
        return pivot + 1;
    }
}