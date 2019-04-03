package t1_q234_palindromelinkedlist;

import punksterUtils_new.ListNode;

public class T1_PalindromeLinkedList {
    public static ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        while (head != null){
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
    }

    public static boolean isPalindrome(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) slow = slow.next;
        slow = reverseLinkedList(slow);
        fast = head;

        while (slow != null && fast != null){
            if (slow.value != fast.value) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(1);
        head.next = a1;
        a1.next = a2;
        a2.next = a3;
        System.out.println(isPalindrome(head));
    }
}
