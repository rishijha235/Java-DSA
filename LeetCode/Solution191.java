public class Solution191 {
    public static void main(String[] args) {
        int n = 15;
        int ans = hammingWeight(n);
        System.out.println(ans);
    }

    public static int hammingWeight(int n){
        int count = 0;
        while(n != 0){
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
