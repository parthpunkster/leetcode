package t1_q19_removenthnodefromendoflist;

import punksterUtils_new.ListNode;

public class T1_RemoveNthNodeFromEndofList {
    public static int lengthOfLinkedList(ListNode head){
        int length = 0;
        while (head != null){
            length++;
            head = head.next;
        }
        return length;
    }

    public static ListNode removeNthFromEndTwoPass(ListNode head, int n){
        int length = lengthOfLinkedList(head);
        ListNode cur = head;
        int modifiedN = length-n;
        while (modifiedN > 1){
            cur = cur.next;
            modifiedN--;
        }
        cur.next = cur.next.next;
        return head;
    }

    public static int helperForOnePass(ListNode head, int n){
        if (head == null) return 0;
        int currentLength = helperForOnePass(head.next,n)+1;
        if (currentLength == n+1){
            head.next = head.next.next;
        }
        return currentLength;
    }

    public static ListNode removeNthFromEndOnePass(ListNode head, int n){
        int length = helperForOnePass(head,n);
        if (length == n){
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(4);
        ListNode a4 = new ListNode(5);
        head.next  =a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        ListNode result = removeNthFromEndOnePass(head,5);
        while (result != null){
            System.out.println(result.value);
            result = result.next;
        }
    }
}
