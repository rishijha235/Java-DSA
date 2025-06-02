//M1 not very good approach as time complexity will be n square
public class SumOfSquareNums633 {
    public static void main(String[] args) {
        int c = 2147483600; //time limit exceed if c == 2147483647(last digit in int range)
        System.out.println(judgeSquareSum(c));
    }

    public static boolean judgeSquareSum(int c) {
        for (int a = 0; a * a <= c; a++) {
            for (int b = (int) Math.sqrt(c - a * a); b >= 0; b--) {
                if (a * a + b * b == c) {
                    return true;
                }
            }
        }
        return false;
    }
}


// //M2
// public class SumOfSquareNums633 {
//     public static void main(String[] args) {
//         int c = 2147483600; 
//         System.out.println(judgeSquareSum(c));
//     }

//     public static boolean judgeSquareSum(int c) {
//         int a = 0;
//         long b = (long) Math.sqrt(c);
        
//         while (a <= b) {
//             long sum = (a * a) + (b * b);
//             if (sum == c) {
//                 return true;
//             }
//             if (sum < c) {
//                 a += 1;
//             } else {
//                 b -= 1;
//             }
//         }
        
//         return false;
//     }
// }


// //M3 suggested by copilot
// public class SumOfSquareNums633 {
//     public static void main(String[] args) {
//         int c = 32; 
//         System.out.println(judgeSquareSum(c));
//     }

//     public static boolean judgeSquareSum(int c) {
//         for (long a = 0; a * a <= c; a++) {
//             double b = Math.sqrt(c - a * a);
//             if (b == (int) b) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }


// //M4 by solution )(understand by dryrun for more clarity)
// public class SumOfSquareNums633 {
//     public static void main(String[] args) {
//         int c = 36; 
//         System.out.println(judgeSquareSum(c));
//     }
//     public static boolean judgeSquareSum(int c) {
//         for (int divisor = 2; divisor * divisor <= c; divisor++) {
//             int count = 0;
//             if (c % divisor == 0) {
//                 while (c % divisor == 0) {
//                     count++;
//                     c /= divisor;
//                 }
//                 if (divisor % 4 == 3 && count % 2 != 0) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }