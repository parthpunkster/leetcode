package leetcode_amazon;

import punksterUtils_new.ListNode;

public class Q141_LinkedListCycle {
    public static boolean hasCycle(ListNode head){
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast!= null && fast.next!= null){
            if (fast == slow) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }


    public static void main(String[] args) {

    }
}
