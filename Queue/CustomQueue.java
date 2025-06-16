package Queue;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0; // pointing to the end of the queue, -1 means queue is empty


    public CustomQueue() {
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length; // ptr is at last index
    }

    public boolean isEmpty() {
        return end == 0; 
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full, cannot insert " + item);
            return false;
        }
        data[end++] = item; // insert item at the end of the queue
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()) {
            throw new Exception("Cannot remove from an empty queue");
        }

        int removed = data[0];
        // Shift all elements to the left
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if(isEmpty()) {
            throw new Exception("Cannot get front from an empty queue");
        }
        return data[0]; // returns the front element without removing it
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <-");
        }
        System.out.println(" End");
    }
}
