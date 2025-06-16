package Stack;
import java.util.Stack;

public class InBuiltExamples {

    //First In Last Out (FILO) or Last In First Out (LIFO)
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(1); // Adds an element to the top of the stack
        stack.push(2); // Adds another element to the top of the previous one
        stack.push(3); 
        stack.push(4);
        stack.push(5);
        
        System.out.println(stack.pop()); // Removes the top element and returns it
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());  
    }
}
