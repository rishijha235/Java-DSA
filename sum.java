import java.util.Scanner;

public class sum {
     public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter first no. : ");
      float a = sc.nextFloat();
      System.out.print("Enter second no. : ");
      float b = sc.nextFloat();

        float sum = a+b;
        System.out.print("The sum is : ");
        System.out.print(sum);
        sc.close();
     }
}