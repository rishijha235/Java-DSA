import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is Armstrong or not: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;
        while(temp != 0) {
            int rem = temp % 10;
            count = count + (rem * rem * rem);
            temp = temp / 10;
        }
            if(num == count)
                System.out.println(num + " is an Armstrong number");
            else 
                System.out.println(num + " is not an Armstrong number");
    }
}
