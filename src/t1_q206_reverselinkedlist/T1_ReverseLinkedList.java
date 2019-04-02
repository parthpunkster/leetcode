package t1_q206_reverselinkedlist;

import punksterUtils_new.ListNode;

public class T1_ReverseLinkedList {
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        while (head != null){
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
    }

    public static ListNode reverseList_recurssion_helper(ListNode head, ListNode prev){
        if (head == null){
            return prev;
        }
        ListNode tmp = reverseList_recurssion_helper(head.next,head);
        head.next = prev;
        return tmp;
    }

    public static ListNode reverseList_recurssion(ListNode head){
        if (head == null) return null;
        return reverseList_recurssion_helper(head,null);
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(4);
        ListNode a4 = new ListNode(5);
        head.next = a1;
        a1.next  = a2;
        a2.next = a3;
        a3.next = a4;
        System.out.println(reverseList_recurssion(head));
    }
}
