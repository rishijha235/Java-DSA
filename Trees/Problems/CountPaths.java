import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class CountPaths {
    // count all path with the given sum from anywhere (from root to leaf or middle)
    public static int countPaths(Node node, int sum) {
        List<Integer> path = new LinkedList<>();
        return helper(node, sum, path);
    }

    private static int helper(Node node, int sum, List<Integer> path) {
        if (node == null) {
            return 0;
        }

        path.add(node.val);
        int count = 0;
        int s = 0;
        
        // how many paths i can make from the current node
        // start from lower bottom because the top already checked
        ListIterator<Integer> itr = path.listIterator(path.size());
        while (itr.hasPrevious()) {
            s += itr.previous();
            
            if (s == sum) {
                count++;
            }
        }

        count += helper(node.left, sum, path) + helper(node.right, sum, path);

        //backtrack
        path.remove(path.size() - 1);

        return count;
    }

    public static void main(String[] args) {
        /*
               10
              /  \
             5   -3
            / \    \
           3   2    11
          / \   \
         3  -2   1
        */

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(-3);

        root.left.left = new Node(3);
        root.left.right = new Node(2);
        root.right.right = new Node(11);

        root.left.left.left = new Node(3);
        root.left.left.right = new Node(-2);
        root.left.right.right = new Node(1);

        int targetSum = 8;
        int result = countPaths(root, targetSum);

        System.out.println("Number of paths with sum " + targetSum + " = " + result);
    }
}
// Time Complexity: O(n^2) if the tree is skewed, O(n log n) if balanced
// Space Complexity: O(n) if the tree is skewed, O(log n) if balanced
