import java.util.Arrays;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'e', 'e', 'e', 'e', 'e', 'e', 'n', 'n', 'n', 'n'};
        char target = 'g';
        char ans = binarySearch(letters, target);
        System.out.println(ans);
    }
    //by self
    // for char in ascending order
    static char binarySearch(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            if (letters[letters.length -1] <= target) {
                return letters[start];
            }
            int mid = start + ((end - start) / 2);
            else if (letters[mid] > target) {
                end = mid - 1;
            } else if (letters[mid] <= target) {
                start = mid + 1;
            }
        }
        return letters[start];
    }


    // // M2 by leetcode solution
    // static char binarySearch(char[] letters, char target){
    //     int start = 0;
    //     int end = letters.length - 1;

    //     while (start <= end) {
    //         int mid = start + ((end - start) / 2);
    //         if (letters[mid] <= target) {
    //             start = mid + 1;
    //         } else {
    //             end = mid - 1;
    //         }
    //     }
    //     //if start is 2 then 2 % length of letters = 2, 
    //     //and if start is greater than the length of letters then it will return the [0]th element of the letters array
    //     return letters[start % letters.length];
    // }
}
