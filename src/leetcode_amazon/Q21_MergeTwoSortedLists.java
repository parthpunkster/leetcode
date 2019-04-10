package leetcode_amazon;

import punksterUtils_new.ListNode;

public class Q21_MergeTwoSortedLists {
    public static ListNode mergeTwoLists_rec(ListNode l1, ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = null;
        if (l1.value<l2.value){
            head = l1;
            head.next = mergeTwoLists(l1.next,l2);
        }
        else {
            head = l2;
            head.next = mergeTwoLists(l1,l2.next);
        }
        return head;

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode prev = null;
        ListNode head = null;
        while (l1!= null && l2!=null){
            if (l1.value<l2.value){
                if (head==null&&prev==null){
                    head = l1;
                    prev = l1;
                }
                else {
                    prev.next = l1;
                    prev = l1;
                }
                l1 = l1.next;
            }
            else {
                if (head == null&& prev==null) {
                    head = l2;
                    prev = l2;
                }
                else {
                    prev.next = l2;
                    prev = l2;
                }
                l2 = l2.next;
            }
        }

        while (l1 != null){
            if (head == null){
                head = l1;
                prev = l1;
            }
            else {
                prev.next = l1;
                prev = l1;
            }
            l1 = l1.next;
        }
        while (l2!=null){
            if (head == null){
                head = l2;
                prev = l2;
            }
            else {
                prev.next = l2;
                prev = l2;
            }
            l2 = l2.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode head = mergeTwoLists_rec(l1,l2);
        while (head!= null){
            System.out.println(head.value);
            head = head.next;
        }
    }
}
