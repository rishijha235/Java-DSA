package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class InbuiltQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1); // Adds an element to the end of the queue
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        //gets the 1st item but not remove it
        System.out.println(queue.peek());
        
        //gets the item and remove it
        System.out.println(queue.remove()); // Removes the head of the queue and returns it
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        // Deque<Integer> deque = new ArrayDeque<>();
        // deque.add(1); // Adds an element to the end of the deque
        // deque.addLast(2); // Adds an element to the end of the deque
        // deque.addFirst(3); // Adds an element to the front of the deque
        // deque.add(4);
        // System.out.println(deque);
        

    }
    
}
