package t1_q2_addtwonumbers;

import punksterUtils_new.ListNode;

public class T1_AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int carry = 0;
        ListNode head = null;
        ListNode prev = null;
        while (l1 != null && l2 != null){
            int sum = l1.value + l2.value + carry;
            carry = sum / 10;
            if (prev == null){
                prev = new ListNode(sum%10);
                head = prev;
            }
            else {
                ListNode tmp = new ListNode(sum%10);
                prev.next = tmp;
                prev = tmp;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 !=null){
            int sum = l1.value + carry;
            carry = sum / 10;
            ListNode tmp = new ListNode(sum%10);
            prev.next = tmp;
            prev = tmp;
            l1 = l1.next;
        }

        while (l2 !=null){
            int sum = l2.value + carry;
            carry = sum / 10;
            ListNode tmp = new ListNode(sum%10);
            prev.next = tmp;
            prev = tmp;
            l2 = l2.next;
        }

        while (carry != 0){
            ListNode tmp = new ListNode(carry % 10);
            carry = carry/10;
            prev.next = tmp;
            prev = tmp;
        }
        return head;
    }

    public static void main(String[] args){
        ListNode h1 = new ListNode(2);
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(3);
        ListNode h2 = new ListNode(5);
        ListNode b1 = new ListNode(6);
        ListNode b2 = new ListNode(4);
        h1.next  = a1;
        a1.next = a2;
        h2.next = b1;
        b1.next = b2;
        ListNode result = addTwoNumbers(h1,h2);
        while (result != null){
            System.out.println(result.value);
            result = result.next;
        }

    }
}
