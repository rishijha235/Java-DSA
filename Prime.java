import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime or not: ");
        int num = sc.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        // // by while loop
        // int i = 2;
        // while (i * i <= num) {
        //     if (num % i == 0) {
        //         return false;
        //     }
        //     i++;
        // }
        // return true;

        //by for loop4
        for(int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }  
        }

        return true;  

    }
}
    

