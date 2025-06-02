package Linkedlist;

public class DLL {

    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        node.prev = null;
        head.prev = node;
        head = node;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Printing in reverse order");
        while(last != null){
            System.out.print(last.val + " <- ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if(head == null){
            node.prev = null;
            head = node;
            node.next = null;
            return;
        }
        // Traverse to the end of the list
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
    }


    //find the node with the given value
    public Node find(int Value){
        Node node = head;
        while(node != null){
            if(node.val == Value){
                return node;
            }
            node = node.next;
        }
        return null;
    }


    //iinsert after a particular node
    public void insert(int after, int val){
        Node p = find(after);

        if(p == null){
            System.out.println("Node does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
    }


    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    
}
