import java.util.Scanner;

public class HackerRanksubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
         System.out.println(a.substring(start, end)); 
         sc.close();
    }
    
}
