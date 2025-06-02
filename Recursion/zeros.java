public class zeros {
    public static void main(String[] args) {
        int n = 1002003010;
        int count = countZeros(n);
        System.out.println("Number of zeros in " + n + " is: " + count);
    }

    public static int countZeros(int n) {
        return helper(n, 0);
    }

    // count no. of zeros in given number
    private static int helper(int n , int count) {
        if (n == 0) {
            return count;
        }
        if( n % 10 == 0) {
            return helper(n / 10, count + 1);
        }
        else{
            return helper(n / 10, count);
        }
    }
}
