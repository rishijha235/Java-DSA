import java.util.Arrays;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers for array: ");
        int[] arr = new int[5];

        //input using for loop
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //simplest way to print the array #M1
        System.out.println(Arrays.toString(arr));
        

        // //output using for loop # M2
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }

        // // output using enhanced for loop #M3
        // for (int num : arr){     //for every element in arr, store it in num
        //     System.out.print(num + " ");  
        // }

        sc.close();
    }
}
