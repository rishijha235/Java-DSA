public class Pattern11 {
    public static void main(String[] args) {
        printPattern(4);
    }
    public static void printPattern(int n){
        int OriginalN = n;
        n = 2 * n;
        for(int row = 1; row < n; row++){
            for(int col = 1; col < n; col++){
                int atEveryIndex = OriginalN + 1 - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
    
}