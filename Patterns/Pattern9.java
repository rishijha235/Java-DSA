public class Pattern9 {
    public static void main(String[] args) {
        printPattern(4);
    }

    public static void printPattern(int n){
        for(int row  = 1; row < 2 * n; row++){
            int totalColsInRow = row > n ? 2 * n - row : row;

            for(int s = 1; s <= n - totalColsInRow; s++){
                System.out.print("  ");
            }

            for(int col = totalColsInRow; col >= 1; col--){
                System.out.print(col + " ");
            }

            for(int col = 2; col <= totalColsInRow; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    
}
