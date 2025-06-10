public class Praveer {
    public static void main(String[] args) {
        System.out.println("Praveer is a Java programmer who loves to solve problems using recursion.");
        System.out.println("He enjoys breaking down complex problems into simpler subproblems.");
        System.out.println("Recursion allows him to write cleaner and more efficient code.");
        System.out.println("Here is a simple recursive function to calculate the factorial of a number:");
        int number = 5; // Example number
        int result = factorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive case
    }
}
