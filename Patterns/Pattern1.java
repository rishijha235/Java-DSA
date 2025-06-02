
public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <=n; row++){
            for(int col = 1; col <=row; col++){
                System.out.print("* ");
            }
            //when one row is printed we need to add a new line
            // System.out.println();
            System.out.print("\n");
        }
    }
}
