import java.util.Arrays;
import java.util.Scanner;
public class MultiDimArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        // arr[][] = {
        //     {1, 2, 3},
        //     {4, 5, 6, 7},
        //     {8, 9}
        // };

        //input from user
        for(int row=0; row < arr.length; row++){
            //For each column in every row of the array
            for(int col=0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }   
        }

        // //Output #M1
        // for(int row=0; row < arr.length; row++){
        //     //For each column in every row of the array
        //     for(int col=0; col < arr[row].length; col++){
        //        System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }  

        // //Output #M2
        // for(int row = 0; row < arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        //outputb using enhenced for loop #M3
        for (int[] values : arr){
            System.out.println(Arrays.toString(values));
        }

    }
    
}
