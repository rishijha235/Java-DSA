import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int N = sc.nextInt();
    
        // for (int i=1;i<=10;i++) Method1
        // {
        // System.out.printf("%d * %d = %d \n",N,i,(N*i));
        // }
        // System.out.printf("\n");
        int i = 1;
        while(i<=10){             //Method2
        System.out.println(N + " * " + i + " = " + N*i);
           i++;
        }
        sc.close();
    }
}
