//Google asked que
// Find the next node in level order traversal of a binary tree
// Given a binary tree and a key, find the next node in level order traversal of the binary tree.
// If the key is not found, return null.// If the key is the last node in level order traversal, return null.
import java.util.LinkedList;
import java.util.Queue;


// Simple binary tree node class for this problem
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class LevelOrderSuccessor {
    public static void main(String[] args) {
        // Example tree:
        //        1
        //      /   \
        //     2     3
        //    / \   /
        //   4   5 6


        // Build the tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        TreeNode successor = findSuccessor(root, 5);
        if (successor != null) {
            System.out.println("Level order successor is: " + successor.val);
        } else {
            System.out.println("No level order successor found.");
        }
    }

    // Updated findSuccessor method for TreeNode
    public static TreeNode findSuccessor(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();

            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
            if (currentNode.val == key) {
                break;
            }
        }
        return queue.peek();
    }

}