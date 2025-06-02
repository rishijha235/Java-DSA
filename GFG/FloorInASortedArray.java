public class FloorInASortedArray{
    public static void main(String[] args) {
        long arr[] = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int n = arr.length;
        long x = 5;
        int result = findFloor(arr, n, x);
        if(result == -1)
            System.out.println("Element not present in array");
        else
            System.out.println("Floor of " + x + " is " + result);
    }
    static int findFloor(long arr[], int n, long x) {
        int max = - 1;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + ((end - start) / 2);
            if(arr[mid] == x){
                return mid;
            }
            if(arr[mid] > x){
                end = mid - 1;
            }
            else{
                max = mid;
                start = mid + 1;
            }
        }
        return max;
    }
}