public class palindrome {
    public static void main(String[] args) {
        System.out.println(palin(12321));
    }

    //reverse a number by recursion
    static int rev2(int n) {
        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int lastDigit = n % 10;
        return lastDigit * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }


    // palindrome number
    static boolean palin(int n) {
        return n == rev2(n);
    }
}
