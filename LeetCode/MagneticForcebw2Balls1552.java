import java.util.Arrays;
//by video solution (need to understand better)
public class MagneticForcebw2Balls1552 {
    public static void main(String[] args) {
        int[] position = {5,4,3,2,1,1000000000};
        int m = 1;
        System.out.println(maxDistance(position, m));
    }
    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int end = position[position.length - 1] - position[0];
        int start = 1;
        int ans = 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(isPossible(position, m, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] position, int m, int mid) {
        int prev = position[0];
        m -= 1;
        for (int i = 1; i < position.length; i++) {
            if (position[i] - prev >= mid) {
                m -= 1;
                prev = position[i];
            }
            if (m == 0) return true;
        }
        return false;
    }
        
}
