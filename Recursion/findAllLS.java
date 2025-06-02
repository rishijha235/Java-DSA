import java.util.ArrayList;

public class findAllLS {
    public static void main(String[] args) {
        int[] arr = {9, 18, 13, 9, -9, 0, 11, 9};
        int target = 9;

        findAllIndex(arr, target, 0);
        if(list.isEmpty()) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at indices: " + list);
        } 
    }

    // Linear search using recursion to find all target exists in the array
    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAllIndex(int[] arr, int target, int index) {
        if(index == arr.length) {
            return; // target not found
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }
}
