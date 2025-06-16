package Stack;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5); // Custom stack with a fixed size of 5
        // DynamicStack stack = new DynamicStack(5); // Dynamic stack that can grow beyond the initial size
        // CustomStack stack = new DynamicStack(5); 

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6); // This will throw an exception since the stack is full

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    }
}
