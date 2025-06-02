public class fact {
    public static void main(String[] args) {
        long ans = factorial(5);
        System.out.println("Factorial: " + ans);
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * factorial(n - 1); // Recursive case: n * factorial of (n-1)
    }
}
