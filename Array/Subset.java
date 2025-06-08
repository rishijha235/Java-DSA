import java.util.ArrayList;
import java.util.List;
public class Subset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(subset(arr));
    }

    // Function to generate all subsets of a given array
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>()); // Adding the empty subset

        for (int nums : arr) {
            int n = outer.size(); // Current size of the outer list

            for(int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i)); // Create a new subset from the existing one
                inner.add(nums); // Add the current number to the new subset
                outer.add(inner); // Add the new subset to the outer list
            }
        }

        return outer;
    }
}


//Time Complexity: (n * 2^n) = O(2^n) - Each element can either be included or excluded, leading to 2^n possible subsets.
//Space Complexity: O(n * 2^n) - 2^n for total subsets and n for each subset's storage in the list.
// This code generates all subsets of a given array using an iterative approach.