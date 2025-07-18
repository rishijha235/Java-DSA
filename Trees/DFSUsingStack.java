import java.util.Stack;

public class DFSUsingStack {

    // pre ordre traversal
    void dfsStack(Node node) {
        if(node == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.val + " ");

            if(current.right != null) {
                stack.push(current.right);
            }
            if(current.left != null) {
                stack.push(current.left);
            }
        }
    }

    // Node class definition
    static class Node {
        int val;
        Node left;
        Node right;
    }

    public static void main(String[] args) {
        // Example usage
        Node root = new Node();
        root.val = 1;
        root.left = new Node();
        root.left.val = 2;
        root.right = new Node();
        root.right.val = 3;
        root.left.left = new Node();
        root.left.left.val = 4;
        root.left.right = new Node();
        root.left.right.val = 5;
        DFSUsingStack dfs = new DFSUsingStack();
        System.out.println("DFS using stack:");
        dfs.dfsStack(root);
        // Output should be: 1 2 4 5 3
    }
}

// // Node class definition
//     class Node {
//         int val;
//         Node left;
//         Node right;
//     }
