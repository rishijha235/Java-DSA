public class MinNoOfDays1482 { 
    public static void main(String[] args) { 
        int[] bloomDay = {7,7,7,7,12,7,7}; 
        int m = 2; 
        int k = 3; 
        System.out.println(minDays(bloomDay, m, k));
    }

    public static int minDays(int[] bloomDay, int m, int k) { // Method to calculate minimum number of days
        if (bloomDay.length < m * k) { // Check if there are enough flowers to make required bouquets
            return -1; // Not enough flowers to make required bouquets
        }

        int start = 1, end = (int)1e9; 
        int ans = -1; 

        while (start <= end) { // Binary search loop
            int mid = start + (end - start) / 2; 

            if (canMakeBouquets(bloomDay, mid, m, k)) { // Check if bouquets can be made on mid day
                ans = mid; 
                end = mid - 1;
            } else {
                start = mid + 1; 
            }
        }

        return ans; 
    }

    public static boolean canMakeBouquets(int[] bloomDay, int days, int m, int k) { // Method to check if bouquets can be made on given days
        int bouquets = 0; 
        int flowers = 0; 

        for (int i = 0; i < bloomDay.length; i++) { 
            if (bloomDay[i] <= days) { // Check if flower can bloom on given days
                flowers++; 
                if (flowers == k) { // Check if enough flowers for a bouquet
                    bouquets++; 
                    flowers = 0; // Reset number of flowers
                }
            } else {
                flowers = 0; // Reset number of flowers
            }
        }

        return bouquets >= m; // Returns true if enough bouquets can be made
    }
}





