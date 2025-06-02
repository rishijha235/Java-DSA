package Queue;

import java.util.Queue;
import java.util.LinkedList;

public class InbuiltQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        //gets the item but not remove it
        System.out.println(queue.peek());
        
        //gets the item and remove it
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
    
}
