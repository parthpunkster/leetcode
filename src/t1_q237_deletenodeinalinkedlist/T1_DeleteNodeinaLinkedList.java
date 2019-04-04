package t1_q237_deletenodeinalinkedlist;

import punksterUtils_new.ListNode;

public class T1_DeleteNodeinaLinkedList {
    public static void deleteNode(ListNode node){
        while (node.next.next != null){
            node.value = node.next.value;
            node = node.next;
        }
        node.value = node.next.value;
        node.next = null;
     }

    public static void main(String[] args){
        ListNode node = new ListNode(4);
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(9);
        node.next = n1;
        n1.next = n2;
        n2.next = n3;
        deleteNode(n1);
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }

    }
}
