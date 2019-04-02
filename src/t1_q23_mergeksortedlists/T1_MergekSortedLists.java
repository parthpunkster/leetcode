package t1_q23_mergeksortedlists;

import punksterUtils_new.ListNode;

import java.util.ArrayList;
import java.util.Collections;

public class T1_MergekSortedLists {
    public static ListNode mergeKLists_BruteForce(ListNode[] lists){
        ArrayList<Integer> lst = new ArrayList<>();
        for (ListNode head : lists){
            while (head != null){
                lst.add(head.value);
                head = head.next;
            }
        }

        Collections.sort(lst);
        ListNode head = null;
        ListNode prev = null;
        for (Integer elem : lst){
            if (head == null){
                prev = new ListNode(elem);
                head = prev;
            }
            else {
                ListNode tmp = new ListNode(elem);
                prev.next = tmp;
                prev = tmp;
            }
        }
        return head;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(5);
        ListNode l2 = new ListNode(1);
        ListNode b1 = new ListNode(3);
        ListNode b2 = new ListNode(4);
        ListNode l3 = new ListNode(2);
        ListNode c1 = new ListNode(6);
        l1.next = a1;
        a1.next = a2;
        l2.next = b1;
        b1.next = b2;
        l3.next = c1;
        ListNode result = mergeKLists_BruteForce(new ListNode[]{l1,l2,l3});
        while (result != null){
            System.out.println(result.value);
            result = result.next;
        }
    }
}
