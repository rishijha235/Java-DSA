package Linkedlist;

public class CLL {

    private Node head;
    private Node tail;


    public CLL(){
        this.head = null;
        this.tail = null;
    }

    //inserting at the beginning of the linked list (head)
    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            node.next = head;
            return;
        }
        node.next = head;
        tail.next = node;
        head = node;
    }

    //inserting at the end of the linked list (tail)
    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            node.next = head;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    //deleting particular value
    public void delete(int val){
        Node node = head;
        if(node == null){
            System.out.println("List is empty");
            return;
        }

        if(node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        } while(node != head);
    }


    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.val + " -> ");
                node = node.next;
            }while(node != head);
            System.out.println("HEAD");
        }
        else{
            System.out.println("List is empty");
        }
    }





    private class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }
}
