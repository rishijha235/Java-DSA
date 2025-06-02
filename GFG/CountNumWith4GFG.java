//numbers that contins a digit 4
public class CountNumWith4GFG {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countNumberswith4(n));
        
    }
    public static int countNumberswith4(int n) {
        // code here
        int count = 0;
    
        for(int i = 4; i <= n; i ++ ){
            int temp = i;
            while (temp > 0){
                if(temp % 10 == 4){
                    count += 1;
                    break;
                }
                temp /= 10;
            }
        }
        return count;
    }
    
}








  


