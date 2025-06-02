public class RotatedBS{
    public static void main(String[] args) {
        int[] arr = {4, 5, 0, 1, 2};
        int target = 0;
        int result = search(arr, target, 0, arr.length - 1);
        System.out.println(result == -1 ? "Element not found in the array." : "Element found at index: " + result);
    }

    static int search(int[] arr, int target, int s, int e) {
        if(s > e){
            return -1; // target not found
        }

        int mid = s + (e - s) / 2;
        if(arr[mid] == target) {
            return mid; // target found
        }

        // If the left half is sorted
        if(arr[s] <= arr[mid]) {
            // Check if target is in the left half
            if(target >= arr[s] && target < arr[mid]) {
                return search(arr, target, s, mid - 1);
            } else {
                // Target is in the right half
                return search(arr, target, mid + 1, e);
            }
        }

        // If the right half is sorted
        if(target >= arr[mid] && target <= arr[e]) {
            // Check if target is in the right half
            return search(arr, target, mid + 1, e);
        }

        // Target is in the left half
        return search(arr, target, s, mid - 1);

    }
}
