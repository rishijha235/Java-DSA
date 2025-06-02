import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4 , 3, 1, 5, 2};
        System.out.println(Arrays.toString(cyclicSort(arr)));

    }
    
    public static int[] cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
        return arr;
    }
    
}
