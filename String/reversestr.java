import java.util.Scanner;

public class reversestr {
        public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String s = "";
        int length=A.length();
        // A = A.toLowerCase();
        for(int i=length-1; i>=0; i--){
            s = s+A.charAt(i);
            // s = s.toLowerCase();
        }
        System.out.println(s);
       if(A.equals(s)){
        System.out.println("Yes");
       }
       else{
        System.out.println("No");
       }
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



