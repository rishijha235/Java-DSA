package Linkedlist;

public class LL {
    private Node head;
    private Node tail;  //benefit of having tail is that we can insert at the end of the linked list in O(1) time

    private int size;

    public LL(){
        this.size = 0;
    }

    //inserting at the beginning of the linked list
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    //inserting at the end of the linked list
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    //inserting at the given index
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        //start checking from the head
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size += 1;
    }

    //insert using recursion
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size += 1;
            return temp;
        }

        node.next = insertRec(val, --index, node.next);
        return  node;
    }


    //delete the first node
    int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size -= 1;
        return val;
    }

    //get the node at the given index
    public Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    //delete the last node
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    //delete the node at the given index
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value ;

        prev.next = prev.next.next;
        size -= 1;

        return val;
    }


    //find the node with the given value
    public Node find(int Value){
        Node node = head;
        while(node != null){
            if(node.value == Value){
                return node;
            }
            node = node.next;
        }
        return null;
    }


    //printing the linked list
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    
    private class Node {
        private int value;
        private Node next;

        //constructor
        public Node(int value) {
            this.value = value;
        }


        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    
}