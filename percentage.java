import java.util.Scanner;

public class percentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total marks : ");
        int marks = sc.nextInt();
        System.out.print("Enter marks of 1st subject : ");
        int s1 = sc.nextInt();
        System.out.print("Enter marks of 2nd subject : ");
        int s2 = sc.nextInt();
        System.out.print("Enter marks of 3rd subject : ");
        int s3 = sc.nextInt();
        System.out.print("Enter marks of 4th subject : ");
        int s4 = sc.nextInt();
        System.out.print("Enter marks of 5th subject : ");
        int s5 = sc.nextInt();

        float per = ((s1+s2+s3+s4+s5)*100)/marks;
        System.out.print("percentage = ");
        System.out.print(per);
        sc.close();

    }
    
}
