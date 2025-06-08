import java.util.Scanner;

public class SkipWord {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = skipApple(input);
        System.out.print("Result after skipping 'apple': " + result);
        sc.close();
    }

    static String skipApple(String up){
        if(up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
}
