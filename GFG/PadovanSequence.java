public class PadovanSequence {
    public static void main(String[] args) {
        int n = 193;
        System.out.println(padovan(n));
    }
    public static int padovan(int n) {
        // mod is used to ensure that the number doesn't exceed the limit
        int mod = 1000000007;
        if (n < 3){
            return 1;
        }
        int[] p = new int[n + 1];
        p[0] = 1;
        p[1] = 1;
        p[2] = 1;
        for (int i = 3; i <= n; i++) {
            p[i] = (p[i - 2] + p[i - 3]) % mod;
        }
        return p[n];

    }
}

