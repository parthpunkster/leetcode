package leetcode_amazon;

import punksterUtils_new.ListNode;

public class Q234_PalindromeLinkedList {
    public static ListNode reverseList(ListNode head, ListNode prev){
        if (head == null) return prev;

        ListNode tmp = head.next;
        head.next = prev;
        prev = head;
        head = tmp;
        return reverseList(head,prev);
    }

    public static boolean isPalindrome(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null){
            slow = slow.next;
        }
        fast = reverseList(slow,null);
        slow = head;

        while (fast != null){
            if (slow.value != fast.value) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head));
    }
}
