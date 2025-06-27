public class BinarySearchTree {
    public static void main(String[] args) {
            BinarySearchTree tree = new BinarySearchTree();

            int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
            // tree.populate(nums);
            tree.populateSorted(nums);
            tree.display();
            System.out.println("Is the tree balanced? " + tree.balanced());
        }
        
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;
    
    public BinarySearchTree() {
    }

    public int height(Node node) {
        if(node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }
    private Node insert(int value, Node node) {
        if(node == null) {
            node = new Node(value);
            return node;
        }
        if(value < node.getValue()) {
            node.left = insert(value, node.left);
        }
        if(value > node.getValue()) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    // // if the array is sorted then the tree will be unbalanced
    // public void populate(int[] nums){
    //     for(int i = 0; i < nums.length; i++) {
    //         this.insert(nums[i]);
    //     }
    // }

    // to make the tree balanced (if array is sorted)
    // we can take the middle element as the root and then recursively do the same for left and right subarrays
    // in general, we can use self balancing binary trees like AVL or Red-Black trees
    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
        }
        private void populateSorted(int[] nums, int start, int end) {
            if(start >= end) {
                return;
            }

            int mid = (start + end) / 2;
            this.insert(nums[mid]);
            populateSorted(nums, start, mid);
            populateSorted(nums, mid + 1, end);
        } // Time Complexity: O(n log n

    public boolean balanced() {
        return balanced(root);
    }
    private boolean balanced(Node node) {
        if(node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 &&
               balanced(node.left) &&
               balanced(node.right);
    }


    public void display() {
        display(root, "Root Node: ");
    }
    private void display(Node node, String details) {
        if (node == null) {
            // System.out.println(details + "null");
            return;
        }
        System.out.println(details + node.getValue() + " (Height: " + node.height + ")");
        display(node.left, "Left child of " + node.getValue() + ": ");                   
        display(node.right, "Right child of " + node.getValue() + ": ");                 
    }
}
