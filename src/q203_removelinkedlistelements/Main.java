package q203_removelinkedlistelements;

import punksterutils.Node;

public class Main {
    public static Node removeElements(Node head, int val){
        Node n = head;
        if (n == null){
            return n;
        }
        while (n.next != null){
            if (n.next.value == val){
                n.next = n.next.next;
            }
            else {
                n = n.next;
            }
        }
        return head.value == val ? head.next : head;
    }

    public static void main(String[] args){
        Node start = new Node(6);
        start.append(2);
        start.append(6);
        start.append(3);
        start.append(4);
        start.append(5);
        start.append(6);
        removeElements(start,6).printList();
    }
}
