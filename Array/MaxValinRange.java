//For max value in a range
public class MaxValinRange {
    public static void main(String[] args) {
        int[] arr = {2, 22, 31, 40, 24};
        System.out.println(maxRange(arr, 0, 2));
    }
    //function to find max value in a range
    static int maxRange(int[] arr, int start, int end) {
        //check if the range is valid or not
        // //work on edge cases here, like array being null
            // if(start > end){
            //     return -1;
            // }
            // if (arr ==null){
            //     return -1;
            // } 

        int maxVal = arr[0];
        for(int i = start; i <= end; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    
}
