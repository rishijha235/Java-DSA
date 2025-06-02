import java.util.Scanner;
public class greet {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.print("Hello " + name + " have a good day");
        sc.close();
    }
}
