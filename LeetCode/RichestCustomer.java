public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2}, {3, 2}, {5, 7, 3}}; ///Three person with 2, 2, and 3 accounts respectively
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        //row is person and column is account
        for(int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for(int col = 0; col < accounts[row].length; col++) {
                sum += accounts[row][col];
            }
            if(sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
    
}
