// package Trees.AVLTrees;

class AVL {
        
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
    
    public AVL() {
    }

    // Returns the height of the tree
    public int height() {
        return height(root);
    }
    private int height(Node node) {
        if(node == null) {
            return -1;
        }
        return node.height;
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
        return rotate(node);
    }


    private Node rotate (Node node) {
        // Left heavy
        if (height(node.left) - height(node.right) > 1) {
            // Left-Left case
            if(height(node.left.left) - height(node.left.right) > 0) {
                return rightRotate(node);
            }
            // Left-Right case
            if(height(node.left.left) - height(node.left.right) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        // Right heavy
        if (height(node.left) - height(node.right) < -1) {
            // Right-Right case
            if(height(node.right.left) - height(node.right.right) < 0) {
                return leftRotate(node);
            }
            // Right-Left case
            if(height(node.right.left) - height(node.right.right) > 0) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    
    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return c;
    }


    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return p;
    }


    // if the array is sorted then the tree will be unbalanced
    public void populate(int[] nums){
        for(int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

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
    }   // Time Complexity: O(n log n
        


    public boolean isEmpty() {
        return root == null;
    }

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

