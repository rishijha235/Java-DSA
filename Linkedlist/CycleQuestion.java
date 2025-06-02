package Linkedlist;

import java.util.List;

public class CycleQuestion {

    // https://leetcode.com/problems/linked-list-cycle
    // Amazon and Microsoft
    // find if the linked list has a cycle or not
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }


    //find length of the cycle
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                //calculate the length of the cycle;
                ListNode temp = slow;
                int length = 0;
                //using do while loop because initially temp is at slow node(temp == slow), and that will terminate the while loop
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);

                return length;
            }
        }
        return 0;
    }



    // https://leetcode.com/problems/linked-list-cycle-ii
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        //find length of the cycle
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                length = lengthCycle(slow);
                break;
            }
        }
        //if there is no cycle
        if(length == 0){
            return null;
        }
        
        //find the start of the cycle node
        ListNode f = head;
        ListNode s = head;

        while(length > 0){
            s = s.next;
            length--;
        }

        //keep moving both forward until they meet(at cycle start node)
        while(f != s){
            f = f.next;
            s = s.next;
        }
        return s; // return the start of the cycle node

    }


    public static void main(String[] args) {
        // Example usage
        CycleQuestion cycleQuestion = new CycleQuestion();
        ListNode head = cycleQuestion.new ListNode(1);
        head.next = cycleQuestion.new ListNode(2);
        head.next.next = cycleQuestion.new ListNode(3);
        head.next.next.next = head; // Creating a cycle
        // head.next.next.next = null; // Removing the cycle for testing

        System.out.println(cycleQuestion.hasCycle(head)); // Should print true
    }


    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
