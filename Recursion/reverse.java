public class reverse{
    public static void main(String[] args) {
        System.out.println(rev2(1234));
    }

    // //by recursion
    // public static int reverse(int n){
    //     if(n < 10){
    //         return n;
    //     }
    //     int digits = (int) Math.log10(n);
    //     return (n % 10) * (int) Math.pow(10, digits) + reverse(n / 10);
    // }


    //Method 2: Using a helper function
    //sometimes we might need some aditional variables in the arguments
    // in that case, make another function(helper function)
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
    public static void main(String[] args) {
        System.out.println(palin(1));
    }

    static boolean palin(int n) {
        return n == rev2(n);
    }
}