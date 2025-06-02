public class MissingNumInArray {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        int n = 5;
        System.out.println(missingNumber(n, arr));
        
    }

    // //this function only works when array is sorted in ascending order
    // public static int missingNumber(int n, int arr[]) {
    
    //     // Your Code Here
    //     for(int i = 0; i < n - 1; i++){
    //         if(arr[i] > i + 1){
    //             return i+1;
    //         }
    //     }
    //     return n;
    // }
    

    //this will work with any array
    public static int missingNumber(int n, int arr[]) {
        boolean[] visited = new boolean[n + 1];
        
        // Mark visited elements
        for (int i = 0; i < n - 1; i++) {
            visited[arr[i]] = true;
        }
        
        // Find the missing number
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                return i;
            }
        }
        
        return -1; // Return -1 if no missing number found
    }
}
