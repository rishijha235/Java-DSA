import java.util.ArrayList;

public class GrumpyBookstoreOwner1052 {
    public static void main(String[] args) {
        int[] customers = {1,0,1,2,1,1,7,5};
        int[] grumpy = {0,1,0,1,0,1,0,1};
        int minutes = 3;
        System.out.println(maxSatisfied(customers, grumpy, minutes));
        
    }
    
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0;
        
        for(int i = 0; i < grumpy.length; i++){
            if(grumpy[i] == 0){
                sum += customers[i];
            }
        }
        
        int max = 0;
        int current = 0;
        for (int j = 0; j < grumpy.length; j++){
            if(grumpy[j] == 1){
                current += customers[j];
            }
            if(j >= minutes && grumpy[j - minutes] == 1){
                current -= customers[j - minutes];
            }
            max = Math.max(max, current);
            // // Alternate method to find max(same as Math.max)
            // if (current > max) {
            //     max = current;
            // }
        }
        
        return sum + max;
    }
}
