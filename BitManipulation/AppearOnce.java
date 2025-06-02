package BitManipulation;

public class AppearOnce {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 7, 6, 7};
        System.out.println(findAppearOnce(arr));
    }

    public static int findAppearOnce(int[] arr){
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            result ^= arr[i];
        }
        return result;
    }
}