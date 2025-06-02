import java.util.Scanner;
public class Function {
    public static void main(String[] args) {
        
        int ans = sum();
        System.out.println("The sum is : " + ans);
        difference();
    }

        static int sum() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 1st num: ");
            int num1 = sc.nextInt();
            System.out.print("Enter 2nd num: ");
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            return sum;
        }
        static void difference() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 1st num: ");
            int num1 = sc.nextInt();
            System.out.print("Enter 2nd num: ");
            int num2 = sc.nextInt();
            int diff = num1 - num2;
            System.out.println("The difference = " + diff);
        }
    }
    

