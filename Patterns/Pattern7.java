public class Pattern7 {
    public static void main(String[] args) {
        printPattern(5); 
    }
    public static void printPattern(int n){
        for(int row = 0; row < 2 * n; row++){
            int totalColsInRow = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColsInRow;
            for(int s = 0; s < noOfSpaces; s++){
                System.out.print(" ");
            }

            for(int col = 0; col < totalColsInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
