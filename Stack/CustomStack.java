package Stack;

public class CustomStack {
    protected int[] data; // protected because, I don't want to change it ever, myself as well
    private static final int DEFAULT_SIZE = 10; // private because, I don't want people to change it directly

    int ptr = -1; // pointer to the top of the stack, -1 means stack is empty

    //when no size is given, it will create a stack of default size
    public CustomStack() {
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if(isFull()){
            System.out.println("Stack is full, cannot push " + item);
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if(isEmpty()) {
            throw new StackException("Cannot pop from an empty stack"); 
        }
        // int removedItem = data[ptr];
        // ptr--;
        // return removedItem;
        return data[ptr--]; // returns the top element and then decrements the pointer
    }

    public int peek() throws StackException {
        if(isEmpty()) {
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[ptr]; // returns the top element without removing it
    }

    public boolean isFull() {
        return ptr == data.length - 1; // if pointer is at the last index, stack is full
    }

    public boolean isEmpty() {
        return ptr == -1; // if pointer is at -1, stack is empty
    }
    
}
