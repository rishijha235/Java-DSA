import java.util.Scanner; 

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverse(num));
    }

    public static long reverse(int num) {
        long count = 0;
        while (num != 0) {
            int rem = num % 10;
            count = (count * 10) + rem;
            num = num / 10;
            if (count > Integer.MAX_VALUE  || count < Integer.MIN_VALUE ) 
                return 0;
        }
        return (int)count;
    }
}
    

