import java.util.Scanner;

public class solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length()); //Method 1
        // int valuea = A.length(); //Method 2
        // int valueb = B.length();
        // int sum = valuea+valueb;
        // System.out.println(sum);
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        String Auppercase = A.substring(0,1).toUpperCase() + A.substring(1);
        System.out.print(Auppercase);
        String Buppercase = " "+B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(Buppercase);
        sc.close();
    }
}