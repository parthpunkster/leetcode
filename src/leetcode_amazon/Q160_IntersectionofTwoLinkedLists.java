package leetcode_amazon;

import punksterUtils_new.ListNode;

public class Q160_IntersectionofTwoLinkedLists {
    public static NodeForIntersection getTailSize(ListNode head){
        int count = 0;
        while (head.next != null){
            head = head.next;
            count++;
        }
        return new NodeForIntersection(head,++count);
    }

    public static ListNode shiftHead(ListNode head, int k){
        while (k != 0) head = head.next;
        return head;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if (headA == null || headB == null) return null;

        NodeForIntersection TailA = getTailSize(headA);
        NodeForIntersection TailB = getTailSize(headB);

        if(TailA.tail != TailB.tail) return null;

        ListNode longger = null;
        ListNode shorter = null;
        if (TailA.size >= TailB.size) {
            longger = headA;
            shorter = headB;
        }
        else {
            longger = headB;
            shorter = headA;
        }

        longger =shiftHead(longger,Math.abs(TailA.size-TailB.size));

        while (longger != shorter){
            longger = longger.next;
            shorter = shorter.next;
        }
        return longger;

    }

    public static void main(String[] args) {
    }
}
