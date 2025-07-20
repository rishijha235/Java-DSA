import java.util.ArrayList;
import java.util.List;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class ReturnAllPaths {
    // count all path from the root to leaf with the given sum
    public static List<List<Integer>> findPaths(Node node, int sum) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper(node, sum, path, paths);
        return paths;
    }

    private static void helper(Node node, int sum, List<Integer> path, List<List<Integer>> paths) {
        if (node == null) {
            return;
        }

        path.add(node.val);

        if(node.val == sum && node.left == null && node.right == null) {
            paths.add(new ArrayList<>(path));
        } else {
            helper(node.left, sum - node.val, path, paths);
            helper(node.right, sum - node.val, path, paths);
        }
        
        //backtrrack
        path.remove(path.size() - 1);

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

        int targetSum = 18;

        List<List<Integer>> resultPaths = findPaths(root, targetSum);

        System.out.println("Paths with sum " + targetSum + ":");
        for (List<Integer> path : resultPaths) {
            System.out.println(path);
        }

        System.out.println("Total number of paths: " + resultPaths.size());
    }
}
// Time Complexity: O(n log n) in  a balanced tree
// Space Complexity: O(n log n) in a balanced tree



