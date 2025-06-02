public class Pattern4 {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n-row + 1; col++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
