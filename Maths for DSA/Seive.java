
public class Seive {
    public static void main(String[] args) {
        int n = 40;
        //initially all elements are false in boolean array
        boolean[] primes = new boolean[n + 1];
        seiveOfErathosthenes(n, primes);
        for(int i = 2; i <= n; i++) {
            //false in array means array is prime
            if(!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    static void seiveOfErathosthenes(int n, boolean[] primes) {
        for(int i = 2; i <= n; i++) {
            if(!primes[i]){
                for(int j = i*i; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }
        return;
    }
    
}
