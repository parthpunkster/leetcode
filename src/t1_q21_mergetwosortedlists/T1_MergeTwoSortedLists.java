package t1_q21_mergetwosortedlists;

import punksterUtils_new.ListNode;

public class T1_MergeTwoSortedLists {
    public static ListNode mergeTwoSortedlist(ListNode l1, ListNode l2){
        ListNode start = null;
        ListNode prev = null;

        while (l1 != null && l2 != null){
            if (start == null){
                if (l1.value <= l2.value){
                    start = l1;
                    l1 = l1.next;
                }
                else {
                    start = l2;
                    l2 = l2.next;
                }
                prev = start;
            }
            else {
                if (l1.value <= l2.value){
                    prev.next = l1;
                    prev = l1;
                    l1 = l1.next;
                }
                else {
                    prev.next = l2;
                    prev = l2;
                    l2 = l2.next;
                }
            }
        }
        while (l1 != null){
            if (start == null){
                start = l1;
                prev = start;
                l1 = l1.next;
            }
            else {
                prev.next = l1;
                prev = l1;
                l1 = l1.next;
            }
        }
        while (l2 != null){
            if (start == null){
                start = l2;
                prev = start;
                l2 = l2.next;
            }
            else {
                prev.next = l2;
                prev = l2;
                l2 = l2.next;
            }
        }
        return start;
    }

    public static ListNode recursive_MergeTwoSortedLists(ListNode l1, ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.value <= l2.value){
            l1.next = recursive_MergeTwoSortedLists(l1.next,l2);
            return l1;
        }
        l2.next = recursive_MergeTwoSortedLists(l1,l2.next);
        return l2;
    }

    public static void main(String[] args){
//        Create linked List
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode l11 = new ListNode();
        ListNode l12 = new ListNode();
        ListNode l21 = new ListNode();
        ListNode l22 = new ListNode();

        l1.value = 1;
        l1.next = l11;
        l11.value = 2;
        l11.next = l12;
        l12.value = 4;

        l2.value = 1;
        l2.next = l21;
        l21.value = 3;
        l21.next = l22;
        l22.value = 4;

        ListNode result = recursive_MergeTwoSortedLists(l1,l2);

        while (result != null){
            System.out.println(result.value);
            result = result.next;
        }
    }
}
