//HackerRank Problem: Game of Two Stacks
//https://www.hackerrank.com/challenges/game-of-two-stacks/problem
// Problem Statement: You are given two stacks of integers, each containing distinct elements. You can pop elements from either stack, and you want to maximize the sum of the elements you pop until the sum exceeds a given value. The task is to find the maximum sum you can achieve without exceeding that value.

import java.util.Arrays;
import java.util.Scanner;

public class GameofTwoStacks {
    static int twoStacks(int maxSum, int[] a, int[] b) {
        return twoStacks(maxSum, a, b, 0, 0) - 1;
    }

    // not optimal solution, but works for small inputs
    // Time complexity: O(2^(n+m)), where n is the size of array a and m is the size of array b
    private static int twoStacks(int maxSum, int[] a, int[] b, int sum, int count) {
        if(sum > maxSum) {
            return count;
        }

        if(a.length == 0 || b.length == 0) {
            return count;
        }

        int ans1 = twoStacks(maxSum, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int ans2 = twoStacks(maxSum, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);

        return Math.max(ans1, ans2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
        System.out.print("Enter the size of array a: ");
        int n = sc.nextInt();
        System.out.print("Enter the size of array b: ");
        int m = sc.nextInt();
        System.out.print("Enter the maximum sum: ");
        int maxSum = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        System.out.print("Enter the elements of array a:");
        for(int j = 0; j < n; j++) {
            a[j] = sc.nextInt();
        }
        System.out.print("Enter the elements of array b:");
        for(int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
        }
        System.out.print(twoStacks(maxSum, a, b));
            
        }
    }
}
