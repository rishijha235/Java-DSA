import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        // list.add(67);
        // list.add(29);
        // list.add(45);
        // list.add(10);
        // list.add(19);
        // list.add(6);
        // list.add(null);
        // list.set(0, 99);   //to replace the value at index 0 with 99
        // list.remove(2);   //to remove the value at index 2
        // System.out.println(list);

        //input arraylist from user
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
            }


        //get item at any index in arraylist
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");  //pass index here, list[index] syntax will not work here
        
        }
        // System.out.print(list + " ");
    }
}
