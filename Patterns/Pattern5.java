public class Pattern5 {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n){
        for(int row = 1;  row <= n; row ++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + "  ");
            }
            System.out.println();
        }
    }
    
}
