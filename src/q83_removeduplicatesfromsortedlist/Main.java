package q83_removeduplicatesfromsortedlist;

import punksterutils.Node;

public class Main {

    public static Node deleteDuplicates(Node head){
        Node i = head;
        while (i != null && i.next != null){
            if(i.value == i.next.value){
                i.next = i.next.next;
            }
            else {
                i = i.next;
            }
        }
        return head;
    }

    public static void main(String[] args){
        Node n = new Node(1);
        n.append(1);
        n.append(2);
        n.append(3);
        n.append(3);
        deleteDuplicates(n).printList();
    }
}
