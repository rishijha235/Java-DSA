import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class subsetDuplicaate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        System.out.println(subset(arr));
    }

    static List<List<Integer>> subset(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); // Adding the empty subset

        int start = 0; // Start index for duplicates
        int end = 0; // End index for duplicates


        for (int i = 0; i < arr.length; i++) {
            start = 0; // Reset start for each new number

            //if the current and previous element is same then we will start from the end of the previous element (s = e + 1)
            if(i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1; // Start from the end of the previous element
            }
            end = outer.size() - 1; // Update end to the current size of outer list minus one
            int n = outer.size(); // Current size of the outer list

            for(int j = start; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j)); // Create a new subset from the existing one
                inner.add(arr[i]); // Add the current number to the new subset
                outer.add(inner); // Add the new subset to the outer list
            }
        }

        return outer;
    }
}
