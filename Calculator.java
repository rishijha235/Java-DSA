import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from user until user doesn't press X or x
        int ans = 0;
        while (true) {
            // take operator as input
            System.out.print("Enter the operator: ");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // take two numbers as input
                System.out.print("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans =  num1 / num2;
                    }
                    else {
                        System.out.println("Division by zero is not possible");
                        break;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'X' || op == 'x') {
                break;
            } else {
                System.out.println("Invalid operator");
            }
            System.out.println("Answer: " + ans);
        }
        sc.close();
    }
    
}
