import java.util.Scanner;

public class strong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       int fact=1;
        int sum=0;
        int n=t;
        while(n>0){
            int x = n%10;
           
            n = n/10;
            for( int i=x;i>0;i--){
                fact = fact*i;
                
            }
            sum=sum+fact;
            fact=1;
        }
        System.out.println(sum);
    
       if(sum==t){ System.out.println("A perfect strong number");}
       else {System.out.println("Not a perfect strong number");}
       sc.close();
    }

    }
