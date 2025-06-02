public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1, 22, 31, 40, 24};
        System.out.println(max(arr));
    }
    //function to find max value
    static int max(int[] arr) {
        // //check if the array is empty or not
        // if (arr.length == 0) {
        //     return -1;
        // }

        int maxVal = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }   
}




