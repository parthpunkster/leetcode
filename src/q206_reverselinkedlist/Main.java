package q206_reverselinkedlist;

import punksterutils.Node;

public class Main {
    public static Node reverseList(Node head){
        Node current = head;
        Node prev = null;
        while (current !=null){
            Node tempCurrent = current.next;
            current.next = prev;
            prev = current;
            current = tempCurrent;
        }
        return prev;
    }

    public static Node recursive_reverseList(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node prev = recursive_reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.append(2);
        head.append(3);
        head.append(0);
        recursive_reverseList(head).printList();
    }
}
