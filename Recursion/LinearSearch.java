public class LinearSearch {
    public static void main(String[] args) {
        int[] arr ={15, 18, 13, 26, -5, 0, 11, 9};
        int target = 9;
        int result = LS(arr, target, 0);
        if(result == -1) {
            System.out.println("Element not found in the array.");
        }
        else{ 
            System.out.println("Element found at index: " + result);
        }   
    }

    // Linear search using recursion
    public static int LS(int[] arr, int target, int index) {
        if(index == arr.length) {
            return -1; // target not found
        }
        return arr[index] == target ? index : LS(arr, target, index + 1);
    }
}
