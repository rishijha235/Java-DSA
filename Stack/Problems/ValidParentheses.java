// leetcode Problem: Valid Parentheses (Q.20)
// https://leetcode.com/problems/valid-parentheses/
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "({[]})";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if(ch == ')') {
                    if(stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
                if(ch == '}') {
                    if(stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }
                if(ch == ']') {
                    if(stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
