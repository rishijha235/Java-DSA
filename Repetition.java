import java.util.Scanner;
public class Repetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        long num = sc.nextLong();
        System.out.print("Number which is repeated: ");
        int r = sc.nextInt();
        int rep = 0;

        while (num != 0){
            long rem = num % 10;
            if (rem == r){
                rep += 1;
            }
            num = num / 10;
        }
        System.out.println( r + " is repeated " + rep + " time ");
        sc.close();
    }
   
}
