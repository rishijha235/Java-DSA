package BitManipulation;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.:");
        int n = sc.nextInt();
        System.out.println(isEven(n));
        sc.close();
    }

    public static boolean isEven(int n){
        return (n & 1) == 0;
    }
}
