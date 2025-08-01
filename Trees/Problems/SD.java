
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
// leetcode 297. Serialize and Deserialize Binary Tree
// Google, Amazon, FB

public class SD {
    public static List<String> serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        serializeHelper(root, list);
        return list;
    }

    private static void serializeHelper(TreeNode node, List<String> list) {
        if (node == null) {
            list.add("null");
            return;
        } 

        list.add(String.valueOf(node.val));
        serializeHelper(node.left, list);
        serializeHelper(node.right, list);
    }

    public static TreeNode deserialize(List<String> list) {
        Collections.reverse(list); // Reverse the list to use it as a stack

        TreeNode node = deserializeHelper(list);

        return node;
    }

    private static TreeNode deserializeHelper(List<String> list) {
        String value = list.remove(list.size() - 1); // Get the last element

        if (value.charAt(0) == 'n') {
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(value));
        node.left = deserializeHelper(list);
        node.right = deserializeHelper(list);
        return node;
    }
}

// // Leetcode solutoin 
// public class Codec {

//     // Encodes a tree to a single string.
//     public String serialize(TreeNode root) {
//         StringBuilder sb = new StringBuilder();

//         serializeHelper(root, sb);

//         return sb.toString();
//     }

//     private void serializeHelper(TreeNode root, StringBuilder sb) {
//         if(root == null) {
//             sb.append("null,");
//             return;
//         }

//         sb.append(root.val).append(",");
//         serializeHelper(root.left, sb);
//         serializeHelper(root.right, sb);
//     }

//     // Decodes your encoded data to tree.
//     public TreeNode deserialize(String data) {
//     Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
//     return deserializeHelper(nodes);
//     }

//     private TreeNode deserializeHelper(Queue<String> nodes) {
//         String val = nodes.poll();
//         if (val.equals("null")) {
//             return null;
//         }

//         TreeNode node = new TreeNode(Integer.parseInt(val));
//         node.left = deserializeHelper(nodes);
//         node.right = deserializeHelper(nodes);
//         return node;
//     }
// }
