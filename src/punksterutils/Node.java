package punksterutils;

import java.util.HashSet;

public class Node {
    public int value;
    public Node next;
    

    public Node(int value){
        this.value = value;
        this.next = null;
    }

    public void append(int value){
        Node tmp = new Node(value);
        Node n = this;
        while (n.next !=null){
            n = n.next;
        }
        n.next = tmp;
    }

    public void printList(){
        Node first = this;
        while (first != null){
            System.out.println(first.value);
            first = first.next;
        }
    }

    public static boolean hasCycle(Node head){
        HashSet<Node> seen = new HashSet<Node>();
        while (head != null){
            if (seen.contains(head)){
                return true;
            }
            seen.add(head);
            head = head.next;
        }
        return false;
    }
}
