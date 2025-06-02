 // public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
    //     int start = 0;
    //     int end = 0;
    //     int sum = 0;
    //     while (end < n) {
    //         sum += arr[end];
    //         while (sum > s) {
    //             sum -= arr[start];
    //             start++;
    //         }
    //         if (sum == s) {
    //             return new ArrayList<>(Arrays.asList(start + 1, end + 1));
    //         }
    //         end++;
    //     }
    //     return new ArrayList<>(Arrays.asList(-1));
    // }