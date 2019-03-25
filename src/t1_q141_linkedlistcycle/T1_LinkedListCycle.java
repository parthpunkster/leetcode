package t1_q141_linkedlistcycle;

import punksterUtils_new.ListNode;

public class T1_LinkedListCycle {
    public static boolean hasCycle(ListNode head){
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;

    }

    public static void main(String[] args){
        ListNode head = new ListNode();
        head.value = 1;
        ListNode m1 = new ListNode();
        m1.value = 2;
        ListNode m2 = new ListNode();
        m2.value = 3;
        head.next = m1;
        m1.next = m2;
        m2.next = m1;
        System.out.println(hasCycle(head));
    }
}
