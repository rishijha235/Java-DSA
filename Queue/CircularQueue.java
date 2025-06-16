package Queue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int front = 0;
    protected int end = 0; 
    private int size = 0; // current size of the queue


    public CircularQueue() {
        this.data = new int[DEFAULT_SIZE];
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length; 
    }

    public boolean isEmpty() {
        return size == 0; 
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full, cannot insert " + item);
            return false;
        }
        data[end++] = item; // insert item at the end of the queue
        end = end % data.length; 
        size++;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()) {
            throw new Exception("Cannot remove from an empty queue");
        }

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if(isEmpty()) {
            throw new Exception("Cannot get front from an empty queue");
        }
        return data[front]; 
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i = i % data.length;
            // i = (i + 1) % data.length;
        } while (i != end);
        System.out.println("END");
    }
}

// Time Complexity:
// - insert: O(1) (amortized for dynamic queues)
// - remove: O(1) (constant time for circular queue)
// - front: O(1) (constant time for circular queue)
// - display: O(n) (where n is the number of elements in the queue)
