package t1_q203_removelinkedlistelements;

import punksterUtils_new.ListNode;

public class T1_RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head,int val){
        if (head == null) return null;
        ListNode cur = head;
        while (cur.next != null){
            if (cur.next.value == val){
                cur.next = cur.next.next;
            }
            else cur = cur.next;
        }
        return head.value == val ? head.next : head;
    }

    public static void main(String[] args){
        ListNode n = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(6);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(6);
        System.out.println(removeElements(n,6));
    }
}
