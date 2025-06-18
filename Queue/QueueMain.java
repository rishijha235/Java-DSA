package Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        // CustomQueue queue = new CustomQueue(5); // Custom queue with a fixed size of 5
        // CircularQueue queue = new CircularQueue(5); // Circular queue with a fixed size of 5
        DynamicQueue queue = new DynamicQueue(5); // if more element to insert than the size, it will double the size of the queue, then insert
        

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6); // This will throw an exception since the queue is full

        queue.display();

        System.out.println(queue.remove()); // Removes the head of the queue and returns it
        queue.insert(7);
        
        queue.display();
    }
    
}

//Time Complexity: (Queue)
// - insert: O(1) (amortized for dynamic queues)
// - remove: O(n) (due to shifting elements)
