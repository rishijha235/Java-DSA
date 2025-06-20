// Fackebook
// leetcode Problem: Minimum Add to Make Parentheses Valid (Q.921)
// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
import java.util.Stack;

public class ValidParenthesisMinAdd {
    public static void main(String[] args) {
        String s = "())";
        System.out.println(minAddToMakeValid(s));
    }

    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(ch == ')') {
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.size();
    }
}
 