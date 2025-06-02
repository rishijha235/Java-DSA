import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IndexesofSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int n = 5;
        int s = 12;
        ArrayList<Integer> result = subarraySum(arr, n, s);
        System.out.println(result);
        
    }

    
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int start = 0;
        int end = 0;
        int sum = 0;
        while (end < n) {
            sum += arr[end];
            while (sum > s) {
                sum -= arr[start];
                start++;
            }
            if (sum == s) {
                return new ArrayList<>(Arrays.asList(start + 1, end + 1));
            }
            end++;
        }
        return new ArrayList<>(Arrays.asList(-1));
    }
    


    // // Time Limit Exceeded in this function
    // public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
    //     // code here
    //     for(int i = 0; i < arr.length; i++){
    //         int count = arr[i];
    //         if (arr[i] == s){
    //         return new ArrayList<>(Arrays.asList(i + 1, i + 1));
    //         }
    //         for(int j = i + 1; j <arr.length; j++){
    //         if (arr[j] == s){
    //             return new ArrayList<>(Arrays.asList(j + 1, j + 1));
    //         }
    //         count += arr [j];
    //         if(count == s){
    //             return new ArrayList<>(Arrays.asList(i + 1, j + 1));
    //         }
    //         if(count > s){
    //             break;
    //         }
    //         }
    //     }
    //     return new ArrayList<>(Arrays.asList(-1));
    // }

    // // Time Limit Exceeded in this function too
    // public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
    //     int start = 0;
        
    //     while (start < n) {
    //         int end = start + 1;
    //         int sum = arr[start];

    //         if (arr[start] == s) {
    //             return new ArrayList<>(Arrays.asList(start + 1, start + 1));
    //         }
    //         while (sum < s && end < n) {
    //             sum += arr[end];
    //             end++;
    //         }
    //         if (sum == s) {
    //             return new ArrayList<>(Arrays.asList(start + 1, end));
    //         }
    //         start++;
    //     }
    //     return new ArrayList<>(Arrays.asList(-1));
    // }
}
