import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3 ,4 ,1 ,2, -75, 0, 101, 5, 2, 27, -3, 78, -1};
        System.out.print(Arrays.toString(insertion(arr)));
    }

    public static int[] insertion(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    } 
}
