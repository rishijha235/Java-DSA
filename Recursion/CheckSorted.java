public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 8, 5};
        boolean result = isSorted(arr);
        System.out.println(result);
    }

    // Check if an array is sorted in ascending order using recursion
    static boolean isSorted(int[] arr) {
        return helper(arr, 0);
    }

    private static boolean helper(int[] arr, int index) {
        if(index == arr.length - 1) {
            return true;
        }

        if(arr[index] > arr[index + 1]){
            return false;
        }

        return   helper(arr, index + 1);
    }

}
