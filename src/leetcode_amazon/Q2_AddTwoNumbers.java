package leetcode_amazon;

import punksterUtils_new.ListNode;

public class Q2_AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode head = null;
        ListNode prev = null;
        int carry = 0;

        while (l1!=null && l2!=null){
            int val = l1.value+l2.value+carry;
            ListNode tmp = new ListNode(val%10);
            carry = val/10;
            if (head == null){
                head = tmp;
                prev = tmp;
            }
            else {
                prev.next = tmp;
                prev = tmp;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1!=null){
            int val = l1.value+carry;
            ListNode tmp = new ListNode(val%10);
            carry = val/10;
            if (head == null){
                head = tmp;
                prev = tmp;
            }
            else {
                prev.next = tmp;
                prev = tmp;
            }
            l1 = l1.next;
        }

        while (l2!=null){
            int val = l2.value+carry;
            ListNode tmp = new ListNode(val%10);
            carry = val/10;
            if (head == null){
                head = tmp;
                prev = tmp;
            }
            else {
                prev.next = tmp;
                prev = tmp;
            }
            l1 = l2.next;
        }

        while (carry!=0){
            ListNode tmp = new ListNode(carry%10);
            carry = carry/10;
            prev.next = tmp;
            prev = tmp;
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
