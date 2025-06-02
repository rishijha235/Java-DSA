import java.util.*;

public class oddno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n = sc.nextInt();

        // for(int i=1; i<=n; i=i+2){  //M1
        //     System.out.println(i);
        // }
        int i =1;
        while(i<=n){ if(i==5){
            System.out.println("Hii");
            continue;
        }               //M2
            System.out.println(i);
          
        }
        //  do{
        //     System.out.println(i);     //M3
        //     i=i+2;
        // }while(i<=n);
         sc.close();
    }
    
}
