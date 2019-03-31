package t1_q25_reversenodesinkgroup;

import punksterUtils_new.ListNode;

public class T1_ReverseNodesinkGroup {
    public static ListNode reverseKGroup(ListNode head, int k){
        int length = 0;
        ListNode helper = head;
        while (helper != null){
            if (length  == k) break;
            helper = helper.next;
            length++;
        }
        if (length != k) return head;
        int i = 0 ;
        ListNode prev = null;
        ListNode cur = head;
        while (i < k && cur != null){
            ListNode tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
            i++;
        }
        if(head != null) {
            head.next = reverseKGroup(cur,k);
        }
        return prev;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(4);
        ListNode a4 = new ListNode(5);
        head.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        ListNode result = reverseKGroup(head,3);
        while (result != null){
            System.out.println(result.value);
            result = result.next;
        }

    }
}
