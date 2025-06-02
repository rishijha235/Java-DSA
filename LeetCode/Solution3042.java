public class Solution3042 {
    public static void main(String[] args) {
        String[] words = {"bb","bb"};
        Solution3042 s = new Solution3042();
        int ans = s.countPrefixSuffixPairs(words);
        System.out.println(ans);
    }
    private boolean isPrefixAndSuffix(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        if (n1 > n2) {
            return false;
        }
        return str1.equals(str2.substring(0, n1)) && str1.equals(str2.substring(n2 - n1));
    }

    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length - 1;
        int count = 0;
        if(n <= 1){
            return 0;
        }
        int i = 0;
        int j = i + 1;
        while(i < n){
            if (j < words.length && isPrefixAndSuffix(words[i], words[j])) {
                count++;
            }
            if(j == n){
                i++;
                j = i + 1;
            } else {
                j++;
            }
        }
        return count;
    }
}
