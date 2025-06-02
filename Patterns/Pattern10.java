public class Pattern10 {
    public static void main(String[] args) {
        printPattern(4);
    }
    public static void printPattern(int n){
        n = 2 * n;
        for(int row = 0; row <= n; row++){
            for(int col = 0; col <= n; col++){
                int atEveryIndex = Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
    
}
