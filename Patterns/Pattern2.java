public class Pattern2 {
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n){
        
        for (int row = 1; row <=n; row++){
            for(int col = 1; col <=n; col++){
                System.out.print("* ");
            }
            //when one row is printed we need to add a new line
            // System.out.println();
            System.out.print("\n");
        }
    }

}


    
