package t1_q61_rotatelist;

import punksterUtils_new.ListNode;

public class T1_RotateList {
    public static int lengthOfLinkedList(ListNode head){
        int length = 0;
        while (head !=null){
            length++;
            head = head.next;
        }
        return length;
    }

    public static ListNode rotateRight(ListNode head, int k){
        if (head == null) return null;
        int length = lengthOfLinkedList(head);
        if (k%length == 0) return head;
        int toBeRotatedBy = length - (k % length);
        ListNode cur = head;
        while (toBeRotatedBy > 1){
            cur = cur.next;
            toBeRotatedBy--;
        }
        ListNode tmp = cur.next;
        cur.next = null;
        cur = tmp;

        while (cur.next != null){
            cur = cur.next;
        }

        cur.next = head;
        return tmp;
    }


    public static void main(String[] args){
        ListNode head = new ListNode(1);
//        ListNode a1 = new ListNode(2);
//        ListNode a2 = new ListNode(3);
//        ListNode a3 = new ListNode(4);
//        ListNode a4 = new ListNode(5);
//        head.next = a1;
//        a1.next = a2;
//        a2.next = a3;
//        a3.next = a4;
        ListNode res = rotateRight(head,7);
        while (res != null){
            System.out.println(res.value);
            res  = res.next;
        }
    }
}
