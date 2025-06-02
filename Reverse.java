import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        long num = sc.nextLong();

        long result = 0;
        long temp = num;

        while (temp != 0){
            long rem = temp % 10;
            result = result *10 + rem;
            temp /= 10;
        }
        System.out.println("Reverse of " + num + " is : " + result);
    }

}