import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean result = isPalindrome(num);
        System.out.println("Is palindrome: " + result);
        
    }

    public static boolean isPalindrome(int x) {
        String s = "";
        String str = Integer.toString(x);
        for (int i = str.length() - 1; i >= 0; i--) {
            s = s + str.charAt(i);
            
        }
        System.out.println(s);
        return str.equals(s);
    }
}

