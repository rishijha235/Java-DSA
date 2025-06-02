package Linkedlist;

public class main {
    public static void main(String[] args) {
        // LL list = new LL();
        // list.insertLast(5);
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(8);
        // list.insertFirst(17);

        // list.insert(10, 3); //inserting 10 at index 3
        // list.display();

        // System.out.println(list.deleteFirst()); //deleting the first element
        // list.display();

        // System.out.println(list.deleteLast()); //deleting the last element
        // list.display();

        // System.out.println(list.delete(2)); //deleting the element at index 5
        // list.display();

        // // System.out.println(list.find(2)); //finding the index of element 2
        // System.out.println(list.find(10)); //finding the index of element 10

        // list.insertRec(88, 2);
        // list.display();

        // // Doubly Linked List
        // DLL list = new DLL();
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(8);
        // list.insertFirst(17);
        // list.insertLast(99);
        // list.insert(17,100);
        // list.display();


        //Circular Linked List
        CLL list = new CLL();
        list.insert(5);
        list.insert(3);
        list.insert(2);
        list.insert(8);
        list.delete(2);
        list.display();
    } 
}
