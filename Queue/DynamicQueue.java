package Queue;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue() {
        super(); // It will call CircularQueue()
    }

    public DynamicQueue(int size) {
        super(size); // It will call CircularQueue(int size)
    }

    @Override
    public boolean insert(int item) {
        // this takes care of it being full
        if(this.isFull()) {
            //double the array size
            int[] temp = new int[data.length * 2]; // Create a new array with double the size

            //copy all previous item into the new array
            for(int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length]; // Copy elements from the old array to the new array
            }
            front = 0;
            end = data.length;
            data = temp; 
        }

        //at this point we know that array is not full
        //insert item into the circularqueue
        return super.insert(item); // Call the insert method from CircularQueue to add the item
    }
    
}
