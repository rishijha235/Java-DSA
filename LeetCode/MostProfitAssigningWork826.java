public class MostProfitAssigningWork826 {
    public static void main(String[] args) {
        int[] difficulty = {68,35,52,47,86};
        int[] profit = {67,17,1,81,3};
        int[] worker = {92,10,85,84,82};
        System.out.println(maxProfitAssignment(difficulty, profit, worker));
    }
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int d = difficulty.length - 1;
        int w = worker.length - 1;
        int ans = 0;
        while (w >= 0) {
            int max = 0;
            for (int i = d; i >= 0; i--) {
                if (difficulty[i] <= worker[w]) {
                    max = Math.max(max, profit[i]);
                }
            }
            ans += max;
            w--;
        }
        return ans;
    }
}
