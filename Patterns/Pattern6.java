public class Pattern6 {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int  n){
        for(int row = 0; row <= 2 * n - 1; row++){
            //if row is less than n, then totalColsInRow = row else totalColsInRow = 2 * n - row
            int totalColsInRow = row < n ? row : 2 * n - row;
            for(int col = 0; col < totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
