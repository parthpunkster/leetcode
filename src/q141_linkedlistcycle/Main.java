package q141_linkedlistcycle;

import punksterutils.Node;


public class Main {

    public static boolean hasCycle(Node head){
        if (head == null || head.next == null){
            return false;
        }
        Node slow = head;
        Node fast = head.next.next;
        while (slow != fast){
            if (fast == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public static void main(String[] args){
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(3);
        n.next.next.next = n.next;
        System.out.println(hasCycle(n));
    }
}
