public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 5};
        boolean result = isSorted(arr);
        System.out.println(result);
    }

    // Check if an array is sorted in ascending order using recursion
    static boolean isSorted(int[] arr) {
        return helper(arr, 0, 1);
    }

    private static boolean helper(int[] arr, int left, int right) {
        if(arr[left] > arr[right]) {
            return false;
        }

        if(right == arr.length - 1) {
            return true;
        }

        return helper(arr, left + 1, right + 1);
    }

}
