import java.util.Scanner;

public class subarray {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int neg_cnt = 0;
        
        //read elements and store in array
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        //find the count of negative sum
        for(int i=0; i<n; i++){
            //find the individual count of negative numbers 
            int sum = arr[i];
            if(sum < 0){
                neg_cnt++;
            } 
            //find the count sum of subarrays
            for(int  j=i+1; j<n; j++){
                sum += arr[j];
                if(sum < 0){
                    neg_cnt++;
                }
            }
        }
        
        System.out.println(neg_cnt);
        sc.close();
}

}