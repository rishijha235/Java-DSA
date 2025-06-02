import java.util.Scanner;


public class passfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in physics: ");
         byte phy = sc.nextByte();

        System.out.print("Enter marks in chemistry: ");
         byte chem = sc.nextByte();

        System.out.print("Enter marks in mathematics: ");
         byte math = sc.nextByte();

         float avg = (phy + chem + math)/3.0f;

         if(avg>=40 && phy>=33 && chem>=33 && math>=33)
            System.out.println("Congratulations, you have been promoted");
         else System.out.println("Sorry, you have not been promoted! Please try again.");
         System.out.print("Your overall percentage is: "+avg);
         sc.close();

    }
    
}
